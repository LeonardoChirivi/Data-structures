package trees;

public class Tree {

	private Node root;

	public Tree(){
		root = null;
	}

	public void insert( int info ){

		if( root == null ){
			root = new Node(info, null, null);

		} else {
			insertTree(root, info);
		}

	}

	private void insertTree( Node n, int info ){

		if( info <= n.getInfo() ){

			if( n.getLeft() == null ){
				n.setLeft( new Node( info, null, null ) );
			} else {
				insertTree(n.getLeft(), info);
			}

		} else {

			if( n.getRight() == null ){
				n.setRight( new Node(info, null, null) );
			} else {
				insertTree(n.getRight(), info);
			}
		}

	}

	public void delete( int info ){
		remove( root, root, info );
	}

	private void remove( Node parent, Node current, int info ){

		if( current.getInfo() == info ){

			if( current == root ){
				root = null;

				//node has noo children
			} else if( current.getLeft() == null && current.getRight() == null ){

				if( parent.getLeft() == current ){
					parent.setLeft( null );
				} else {
					parent.setRight( null );
				}

				// node has two children
			} else if( current.getLeft() != null && current.getRight() != null ){

				Node successor = minNode( current, current.getRight() );
				successor.setLeft( current.getLeft() );
				successor.setRight( current.getRight() );

				if( parent.getLeft() == current ){
					parent.setLeft( successor );
				} else {
					parent.setRight( successor );
				}

				//node has one child
			} else {

				if( info <= parent.getInfo() ){
					if( current.getLeft() == null ){
						parent.setLeft( current.getRight() );
					} else {
						parent.setLeft( current.getLeft() );
					}

				} else {

					if( current.getLeft() == null ){
						parent.setRight( current.getRight() );
					} else {
						parent.setRight( current.getLeft() );
					}

				}

			}

		} else if( info >= current.getInfo() ){
			remove( current, current.getRight(), info );
		} else {
			remove( current, current.getLeft(), info );
		}

	}

	public void inorder(){
		inorderTree( root );
	}

	private void inorderTree( Node r ){ //SRD

		if( r != null ){
			inorderTree( r.getLeft() );
			System.out.print( r.getInfo()+" " );
			inorderTree( r.getRight() );
		}

	}

	public void postorder(){
		postorderTree( root );
	}

	private void postorderTree( Node r ){// SDR

		if( r != null ){
			postorderTree( r.getLeft() );
			postorderTree( r.getRight() );
			System.out.print( r.getInfo()+" " );
		}

	}

	public void preorder(){
		preorderTree( root );
	}

	private void preorderTree( Node r ){//RSD

		if( r != null ){
			System.out.print( r.getInfo()+" " );
			preorderTree( r.getLeft() );
			preorderTree( r.getRight() );
		}

	}

	private Node minNode( Node parent, Node successor ){

		while ( successor.getLeft() != null ){
			parent = successor;
			successor = successor.getLeft();
		} 

		if( successor.getRight() != null ){
			parent.setLeft( successor.getRight() );
			
		} else {

			if( parent.getLeft() == successor ){
				parent.setLeft( null );
			} else {
				parent.setRight( null );
			}

		}

		return successor;

	}

	public int min( Node r ){

		if( r.getLeft() == null ){
			return r.getInfo();

		} else {
			return min( r.getLeft() );
		}

	}

	public int max( Node r ){

		if( r.getRight() == null ){
			return r.getInfo();

		} else {
			return max( r.getRight() );
		}

	}

	public int depth(){
		return depthTree(root);
	}
	
	public int depthTree( Node n ){
		
		if( n == null ) return 0;
		if( n.getLeft() == null && n.getRight() == null ) return 1;
		else if( n.getLeft() != null && n.getRight() != null ) return depthTree( n.getLeft() ) + depthTree( n.getRight() );
		else if( n.getLeft() == null && n.getRight() == null ) return 1 + depthTree( n.getRight() );
		else return 1 + depthTree( n.getLeft() );
		
	}
	
}
