package com.tree;

import java.util.Scanner;

public class BinarySearchTree {
	static Node root;
	BinarySearchTree(){
		root=null;
		
	}
	
	//Node is created 
	class Node{
		int key;
		Node left;
		Node right;
		Node(int key){
			this.key=key;
			
			}
		}
	
	
	//add method is created
	void add(int key){
		root=addNode(root,key);
	}
	Node addNode(Node root,int key){
		if(root==null){
			root=new Node(key);
			return root;
		}
		 if(key>root.key)
			root.right=addNode(root.right,key);
		
		
		else if(key<root.key) 
			root.left=addNode(root.left,key);
			return root;	
			
}
	
	// inorder traversal
		 public void  inorderTraversal(){
			   inorder(root); 
			   
		   }
		 void inorder(Node root) {
		        if (root != null) {
		            inorder(root.left);
		            System.out.println(root.key);
		            inorder(root.right);
		        }
		    }
		 
		 //method to find height of the tree 
		 int height(Node root) 
		    {
		        if (root == null)
		            return 0;
		        else
		        {
		            
		            int lDepth = height(root.left);
		            int rDepth = height(root.right);
		  
		         
		            if (lDepth > rDepth)
		                return (lDepth + 1);
		             else
		                return (rDepth + 1);
		        }
		    }
		  
		    
		 public static void main(String[] args) {
			BinarySearchTree t=new BinarySearchTree();
			    System.out.println("the nodes added are ");
			    t.add(50);
			    t.add(20);
			    t.add(70);
			    t.add(40);
			    t.add(80);
			    t.add(10);
			    
			    System.out.println("the inorder traversal of tree is:");
			    t.inorderTraversal();
			    System.out.println("the height of tree is:"+" "+t.height(root));
			    

			
				
		 }
		 
		 
		 
		 
		 
		 
		 

}