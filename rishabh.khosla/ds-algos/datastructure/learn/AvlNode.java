package com.learn;
/**
 * here in AvlNode class 
 * created attribute data,height;
 * created Node left,right;
 * @author rishab
 *
 */
public class AvlNode {
	private int data,height;
	private AvlNode left,right;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
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
