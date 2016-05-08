package trees;

public class Node {

	private int info;
	private Node left;
	private Node right;
	
	public Node(int info, Node left, Node right) {
	
		this.info = info;
		this.left = left;
		this.right = right;
		
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
}
