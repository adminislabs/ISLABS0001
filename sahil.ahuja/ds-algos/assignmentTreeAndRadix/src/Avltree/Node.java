package Avltree;

/**
 * 
 * @author sahil This class defines the node of avl tree which has variables key
 *         is of type Integer and it stores the data level is of type Integer
 *         and it stores the level of that particular node left is of type Node
 *         which stores the reference of node's left child right is of type Node
 *         which stores the reference of node's right child
 */
public class Node {

	private int key;
	private int level = 1;
	private Node left;
	private Node right;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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
