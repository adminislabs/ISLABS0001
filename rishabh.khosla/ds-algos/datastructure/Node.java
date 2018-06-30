package learn;
/**
 * 
 * class node is created where the attributes taken are value ,node right,node left
 * @author rishab
 *
 */
public class Node {

	private  Node left;
	private Node right;
	private int value;

	public Node(int value) {
		this.value = value;
		right=left=null;
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

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setValue(Node findMin) {
		// TODO Auto-generated method stub
		
	}
}
