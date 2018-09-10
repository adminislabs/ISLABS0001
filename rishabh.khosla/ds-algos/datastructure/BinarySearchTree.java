package com.tree;
/**
 * 
 * @author rishab
 *
 */
public class BinarySearchTree {

	private TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	BinarySearchTree(){
		root=null;
	}
	/**
	 * this function is used to add the data nodes 
	 * at the approciate location in bst tree
	 * @param root
	 * @param data
	 * @return
	 */
	public TreeNode insert(TreeNode root,int data) {
		if(root==null) {
			root=new TreeNode();
			root.setData(data);
		}
		else if(data<root.getData()) {
			root.setLeft(insert(root.getLeft(),data));
		}
		else if(data>root.getData()) {
			root.setRight(insert(root.getRight(),data));
		}
		return root;
	}
	/**
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public TreeNode delete(TreeNode root,int data) {
		if(root==null)
			return root;
		
		if (data<root.getData())
			root.setLeft(delete(root.getLeft(),data));
		else if(data>root.getData())
			root.setRight(delete(root.getRight(),data));
	
	    else{
		   if(root.getLeft()==null)
			   return root.getRight();
		   else if(root.getRight()==null)
			   return root.getLeft();
		   
		   root.setData(maxValue(root.getLeft()));
		   root.setLeft(delete(root.getLeft(),root.getData()));
	   }
	    return root;
}
	/**
	 * 
	 * @param root
	 * @return
	 */
	 public int maxValue(TreeNode root){
		 int max=root.getData();
		 while(root.getRight()!=null) {
			 max=root.getRight().getData();
			 root=root.getRight();
		 }
		 return max;
	 }
	 //function to calculate max of 2 numbers 
	 public int max(int n1,int n2) {
		 if(n1>n2)
			 return n1;
		 else 
			 return n2;
	 }
	 public int height(TreeNode root) {
		 if(root==null) {
			 return -1;
		 }
		 return 1+(max(height(root.getLeft()),height(root.getRight())));
	 }
	 /**
	  * this function is created to print the tree 
	  * in level order of its drawing
	  * @param root
	  * @param level
	  */
	 public void printlevelOrder() {
		 int h=height(root);
		 for(int i=1;i<=h+1;i++) {
			 printGivenOrder(root,i);
			 System.out.println();
		 }
	 }
	 public void printGivenOrder(TreeNode root,int level) {
		 if(root!=null) {
			 if(level==1) {
				 System.out.println(root.getData());
			 }
			 else if(level >1) {
				 printGivenOrder(root.getLeft(),level-1);
				 printGivenOrder(root.getRight(),level-1);
			 }
		 }
	 }
	 /**
	  * this function is created to 
	  * print the tree in inOrder Traversal manner
	  * @param root
	  */
	 public void inOrder(TreeNode root) {
		 if(root!=null) {
			 inOrder(root.getLeft());
			 System.out.println(root.getData());
			 inOrder(root.getRight());
		 }
	 }}
