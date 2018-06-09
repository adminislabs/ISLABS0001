package com.datastructure.learn;
import java.util.*;
public class BinarySearchTreeDriver {
	

	public static void main(String[] args) {
    BinarySearchTree tree=new BinarySearchTree();
    while(true){
    	
    	System.out.println("Enter ur choice");
		System.out.println("1.Want to insert element");
		System.out.println("3.enter the element to delete");
		System.out.println("4.Print the inorder traversal of tree");
		System.out.println("5.Print the preorder traversal of tree");
		System.out.println("6.Print the postorder traversal of tree");
		System.out.println("7.Want to search any element in tree");
		System.out.println("8.Exit");
		Scanner sc=new Scanner(System.in);
    	int choose=sc.nextInt();
    	switch(choose){
    	case 1:
    		System.out.println("Enter the element to be inserted");
			int item=sc.nextInt();
			tree.insert(item);
			break;
    	case 2:
    		   break;
    	case 3:
    		 break;
    	case 4:
    		 tree.inorderTraversal();
    		 break;
    	case 7:
    		System.out.println("Enter the element to be inserted");
			int m=sc.nextInt();
			tree.searchelement(m);
    	break;
    	}
    	
    	
    	
    	}}
    	
    	
    	
    	
    	
    
    
    
    
}
    
	


