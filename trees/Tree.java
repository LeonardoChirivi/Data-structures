package trees;

public class Tree {

	private Node root;

	public Tree(){
		root = null;
	}

	public void insert( int info ){

		if( root == null ){
			root = new Node(info);

		} else {
			insert(root, info);
		}

	}

	private void insert( Node n, int info ){

		if( info <= n.getInfo() ){

			if( n.getLeft() == null ){
				n.setLeft( new Node( info ) );
			} else {
				insert(n.getLeft(), info);
			}

		} else {

			if( n.getRight() == null ){
				n.setRight( new Node(info) );
			} else {
				insert(n.getRight(), info);
			}
		}

	}

	public void remove( int info ){
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
		inorder( root );
	}

	private void inorder( Node r ){ //SRD

		if( r != null ){
			inorder( r.getLeft() );
			System.out.print( r.getInfo()+" " );
			inorder( r.getRight() );
		}

	}

	public void postorder(){
		postorder( root );
	}

	private void postorder( Node r ){// SDR

		if( r != null ){
			postorder( r.getLeft() );
			postorder( r.getRight() );
			System.out.print( r.getInfo()+" " );
		}

	}

	public void preorder(){
		preorder( root );
	}

	private void preorder( Node r ){//RSD

		if( r != null ){
			System.out.print( r.getInfo()+" " );
			preorder( r.getLeft() );
			preorder( r.getRight() );
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
		return depth(root);
	}
	
	private int depth( Node n ){
		
		if( n == null ) return 0;
		if( n.getLeft() == null && n.getRight() == null ) return 1;
		else if( n.getLeft() != null && n.getRight() != null ) return 1 + Math.max( depth( n.getLeft() ), depth( n.getRight() ) );
		else if( n.getLeft() == null && n.getRight() == null ) return 1 + depth( n.getRight() );
		else return 1 + depth( n.getLeft() );
		
	}

	public int countLeaves(){
		return countLeaves( root );
	}
	
	private int countLeaves( Node n ){
		
		if( n == null ) return 0;
		else if( n.getLeft() == null && n.getRight() == null ) return 1;
		else return countLeaves( n.getLeft() ) + countLeaves( n.getRight() );
		
	}
	
}
