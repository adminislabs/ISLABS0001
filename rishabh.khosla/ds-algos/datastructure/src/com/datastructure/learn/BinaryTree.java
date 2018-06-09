package com.datastructure.learn;

public class BinaryTree {
	Node root;
	
	BinaryTree(){
		root=null;
	}
	
	
	
	

	public class Node{
		int key;
		Node left;
		Node right;
		
		
	public Node(int value){
			key=value;
			 left=right=null;
			
		}	
	}
	
	void Insert(int key){
		root=insertNode(root,key);
		
	}
	
	Node insertNode(Node root,int key){
		if(root==null){
			root=new Node(key);
			return root;
		}
		if(key<root.key){
			root.left=insertNode(root.left,key);}
		
			else if (key>root.key)
			root.right=insertNode(root.right,key);
				
				
			return root;
		}
		void inorder(){
			Inorderrec(root);
		}
		
	
	void Inorderrec(Node root){
		if(root!=null){
			Inorderrec(root.left);
			System.out.println(root.key);
			Inorderrec(root.right);
			
			
		}
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
	BinaryTree tree=new BinaryTree();
	tree.Insert(1);
	tree.Insert(2);
	tree.Insert(3);
	tree.Insert(4);
	tree.Insert(5);
	tree.inorder();
	

	

	
	
	

	}

}
