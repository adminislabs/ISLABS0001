package com.datastructure.learn;

public class BinarySearchTree {

	Node root;
	BinarySearchTree(){
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
	void insert(int key){
		root=insertnode(root,key);
	}
	Node insertnode(Node root,int key){
		if(root==null){
			root=new Node(key);
			return root;
			
		}
		if(key<root.key){
			root.left=insertnode(root.left,key);
		}
		else if(key>root.key)
			root.right=insertnode(root.right,key);
		
		return root;
	}
   void delete(int key){
	   root=deletenode(root,key);
	   
   }
   Node  deletenode(Node root, int key) {
	   if(root==null)return root;
	   
	   if(key<root.key){
		   root.left=deletenode(root.left,key);
	   }
	   else if(key>root.key){
		   root.right=deletenode(root.right,key);
	   }
	   else 
	   {
		   if(root.left==null)
			   return root.right;
		   else if(root.right==null)
			   return root.left;
		      
	   }
	   
	   return root;
}
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
		  
		  public int  searchelement(int key){
			  search(root,key);
			return key ;
			
			  
		  }
		  
		  void search(Node root,int key){
			  if(root.key==key){
				  System.out.println(key);
			  }
			  
			  else if(root.key>key){
				  search(root.left,key);
			  }else if(root.key<key){
				  search(root.right,key);
			  }
			  
			  
		  }
		   
	   
	
	
}
