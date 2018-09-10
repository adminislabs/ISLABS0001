package com.tree;
/**
 * this class is created to create a 
 * node in a tree and class contains left and right child of 
 * current node and key
 * @author rishab
 *
 */
public class TreeNode {
private int data;
private TreeNode left;
private TreeNode right;
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public TreeNode getLeft() {
	return left;
}
public void setLeft(TreeNode left) {
	this.left = left;
}
public TreeNode getRight() {
	return right;
}
public void setRight(TreeNode right) {
	this.right = right;
}
}
