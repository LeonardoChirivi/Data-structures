package trees;

public class Main {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
		tree.insert(10);
		tree.insert(9);
		tree.insert(8);
		tree.insert(7);
		tree.insert(6);
		tree.insert(5);
		tree.insert(4);
		tree.insert(3);
		tree.insert(2);
		tree.insert(1);
		
//		tree.insert(25);
//		tree.insert(15);
//		tree.insert(30);
//		tree.insert(5);
//		tree.insert(20);
//		tree.insert(40);
//		tree.insert(2);
//		tree.insert(19);
//		tree.insert(21);
//		tree.insert(22);
//		
		System.out.println( tree.depth() );
		tree.inorder();
		
	}
	
}
