package com.bst;

import java.util.Scanner;

public class BinarySearchTreeTest {
	
	public static void main(String args[]) {
		
		BinarySearchTree tree=new BinarySearchTree();
		Node root=tree.getRoot();
	        while(true){
	            System.out.println("Enter ur choice");
	            System.out.println("1.Want to insert element");
	            System.out.println("2.Print the inorder traversal of tree");
	            System.out.println("3.Print the preorder traversal of tree");
	            System.out.println("4.Print the postorder traversal of tree");
	            System.out.println("5.Want to calculate  height of tree");
	            System.out.println("6.Exit");
	            Scanner sc=new Scanner(System.in);
	            int choice=sc.nextInt();
	            switch(choice){
	            case 1:
	                System.out.println("Enter the element to be inserted");
	                int item=sc.nextInt();
	                tree.insert(root,item);
	                break;
	            case 2:
					Node root5 = tree.getRoot();
					tree.inorder(root5);
					break;
				case 3:
					Node root1 = tree.getRoot();
					tree.preorder(root1);
					break;
				case 4:
					Node root2 = tree.getRoot();
					tree.postorder(root2);
					break;
				case 5:
					Node root3 = tree.getRoot();
					int height = tree.height(root3);
					System.out.println(height);
                	break;
                	
				case 6:
				   sc.close();
	               java.lang.System.exit(0);
	}}}}


