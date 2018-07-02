package com.bst;
/**
 * 
 * @author roshni
 * Here I create class Node of binary Search Tree
 * Create attributes of Node i.e. Left , Right
 *
 */

public class Node {
	 private int key;
     private  Node left, right;

      public Node(int item) {
          key = item;
          left = right = null;
}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
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

	public void setKey(Node findMin) {
		
		
	}}
