package com.tree;
import java.util.Scanner;
/**
 * 
 * @author rishab
 *
 */
public class PrintBinarySearchTree {
	

	public static void main(String[] args) {
		BinarySearchTree treee=new BinarySearchTree();
		while(true) {
			System.out.println("welcome to binary tree app implementation");
			System.out.println("enter ur choice operation");
			System.out.println("1. enter to insert elements");
			System.out.println("2. enter to delete elements");
			System.out.println("3. enter to print tree in InOrder manner");
			System.out.println("4. enter to print in level order manner");
			System.out.println("5. exit");
			Scanner scan=new Scanner(System.in);
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the elemets ");
				int data=scan.nextInt();
				TreeNode roota=treee.getRoot();
				treee.setRoot(treee.insert(roota, data));
                break;
			
		    case 3:
			TreeNode rootb = treee.getRoot();
			treee.inOrder(rootb);
            break;
            
		    case 4:
		    	treee.printlevelOrder();
		    	
			
		}
		}
}}