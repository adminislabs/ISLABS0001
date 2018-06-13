package com.datastructure.Struct;

public class BSTDelete {
	Node root;
	BSTDelete(){
		root=null;
	}
	
     class Node {
		int key;
		Node left;
		Node right;
		
		Node(int key){
			this.key=key;
		}
	}
     
     // adding nodes with the data
     void add(int key){
    	 root=adddata(root,key);
    	
     }
     Node  adddata(Node root,int key){
    	 if(root==null){
    		 root=new Node(key);
    		 return root;
    	 }
    	 if(key<root.key){
 			root.left=adddata(root.left,key);
 		}
 		else if(key>root.key)
 			root.right=adddata(root.right,key);
 		
 		return root;
     }
     
     void delete(int key){
    	 root=deleteNode(root,key);
     }
     Node deleteNode(Node root,int key){
    	 if(root==null){
    		 return root;
    	 if(key<root.key){
    		 root.left=deleteNode(root.left,key);
    		 
    	 }
    	 else if(key>root.key)
    		 root.right=deleteNode(root.right,key);
    	 
    	 }
    	 if(root.left==null)
			   return root.right;
		   else if(root.right==null)
			   return root.left;
		      
	   }
	   

     
     
     
	
	
	
	

	public static void main(String[] args) {
		

	}

}
