package binarySearch;

/**
 * 
 * @author sahil This is the class node for binary search tree containing item
 *         of type Integer which stores the data left of type Node which stores
 *         reference of node's left child right of type Node which stores
 *         reference of node's right child
 */

public class Node {
	private int item;
	private Node left;
	private Node right;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
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
