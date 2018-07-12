package com.practice;
/**
 * Here I created AvlNode with its attributes item,height
 *and created attribute of Node i.e. left,right
 */

public class AvlNode {
	private int item, height;
	private AvlNode left,right;
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public AvlNode getLeft() {
		return left;
	}
	public void setLeft(AvlNode left) {
		this.left = left;
	}
	public AvlNode getRight() {
		return right;
	}
	public void setRight(AvlNode right) {
		this.right = right;
	}
	

}
