package trees;

public class Main {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
//		tree.insert(10);
//		tree.insert(9);
//		tree.insert(8);
//		tree.insert(7);
//		tree.insert(6);
//		tree.insert(5);
//		tree.insert(4);
//		tree.insert(3);
//		tree.insert(2);
//		tree.insert(1);
		
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
//		tree.insert(18);
//		tree.insert(17);
		
		
//		tree.insert(90);
//		tree.insert(50);
//		tree.insert(150);
//		tree.insert(20);
//		tree.insert(75);
//		tree.insert(95);
//		tree.insert(175);
//		tree.insert(5);
//		tree.insert(25);
//		tree.insert(66);
//		tree.insert(80);
//		tree.insert(92);
//		tree.insert(111);
//		tree.insert(166);
//		tree.insert(200);
		
//		System.out.println( tree.depth() );
//		tree.inorder();
		
//		tree.insert(10);
//		tree.insert(7);
//		tree.insert(20);
//		tree.insert(6);
//		tree.insert(8);
//		tree.insert(15);
//		tree.insert(23);
//		tree.insert(17);
//		tree.insert(19);
		
		tree.insert(15);
		tree.insert(6);
		tree.insert(20);
		tree.insert(5);
		tree.insert(10);
		tree.insert(16);
		tree.insert(25);
		tree.insert(8);
		tree.insert(14);
		tree.insert(30);
		
		tree.inorder();
		System.out.println();
		tree.preorder();
		System.out.println();
		tree.postorder();
		
	}
	
}
