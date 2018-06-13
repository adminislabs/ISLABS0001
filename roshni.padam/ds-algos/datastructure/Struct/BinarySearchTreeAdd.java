package com.datastructure.Struct;

public class BinarySearchTreeAdd {
	Node root;
	BinarySearchTreeAdd(){
		root=null;
		
	}
	class Node{
		int key;
		Node left;
		Node right;
		Node(int key){
			this.key=key;
			
			}
		}
	
	void add(int key){
		root=addNode(root,key);
	}
	Node addNode(Node root,int key){
		if(root==null){
			root=new Node(key);
			return root;
		}
		else if(key>root.key){
			root.right=addNode(root.right,key);
		}
		else if(key<root.key)
			root.left=addNode(root.left,key);
			return root;
		
		
	
	}
	// inorder traversal
	 public void  inorderTraversal(){
		   inorder(root);
		   return;
		   
		   
	   }
	 public void inorder(Node root) {
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.println(root.key);
		inorder(root.right);
		return;
	}
	 // post traversal
	   public void postTraversal(Node root){
		  post(root);
		  return;
		   }
		  public void post(Node root){
			  if(root==null){
				  return;
			  }
			  post(root.left);
			  post(root.right);
			  System.out.println(root.key);
			  return;
		  }
		   
	   
		 
	   //pre order traversal
		  public void preTraversal(Node root){
			  pre(root);
			  return;
			   }
			  public void pre(Node root){
				  if(root==null){
					  return;
				  }
				  System.out.println(root.key);
				  pre(root.left);
				  pre(root.right);
				  return;
				
			  }

	public static void main(String[] args) {
		BinarySearchTreeAdd bb=new  BinarySearchTreeAdd(); 
		bb.add(3);
		bb.add(4);
		bb.add(8);
		bb.add(1);
		bb.add(6);
		bb.inorderTraversal();
		
		
		

	}

}
