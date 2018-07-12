package com.learn;

import java.util.Scanner;
/**
 * This class is created to to test our avlTree functionality
 * in terms of inserting the element ,traversing ,searching and finding 
 * the minimum and maximum element
 * @author rishab
 *
 */
public class AvlTestCode {
	public static void main(String[] args) {
				AvlTree avl = new AvlTree();
				Scanner sc = new Scanner(System.in);
				while (true) {
					System.out.println("Welcome user in the AvlTree application");
					System.out.println("1.press 1 to insert the element");
					System.out.println("2.press 2 to Print the inorder traversal of tree");
					System.out.println("3.press 3 to Print the preorder traversal of tree");
					System.out.println("4.press 4 to Print the postorder traversal of tree");
					System.out.println("5.press 5 to search element");
					System.out.println("6.press 6 to find the minimum element");
					System.out.println("7.press 7 to find the maximum element");
					System.out.println("8.press 8 to print tree in level order manner");
		            System.out.println("9.Exit");
			    int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the element to be inserted");
					int data = sc.nextInt();
					AvlNode root4 = avl.getRoot();
					avl.setRoot(avl.insert(root4, data));
					System.out.println("element inserted ");
					break;
				case 2:
					System.out.println("the traversal of tree in inorder manner is:");
					AvlNode roota = avl.getRoot();
					avl.inorder(roota);
					break;
				case 3:
					System.out.println("the traversal of tree in preorder manner is:");
					AvlNode rootb = avl.getRoot();
					avl.preorder(rootb);
					break;
				case 4:
					System.out.println("the traversal of tree in postorder manner is:");
					AvlNode rootc = avl.getRoot();
					avl.postorder(rootc);
					break;
				case 5:
					System.out.println("Enter integer element to search");
		            int val=sc.nextInt();
		            AvlNode rootd=avl.getRoot();
					System.out.println("Search result : "+avl.search(rootd,val));
					break;
				case 6:
					System.out.println("the minimum element in our avl tree is ");
					AvlNode roote=avl.getRoot();
					System.out.println(avl.minValue(roote));
					break;
				case 7:
					System.out.println("the maximum element in our avl tree is ");
					AvlNode rootf=avl.getRoot();
					System.out.println(avl.maxValue(rootf));
					break;
				case 8:
					System.out.println("the tree is printing in level order manner");
					AvlNode rootg=avl.getRoot();
					//System.out.println(avl.printGivenLevel(rootg,height);
					break;
				case 9:
					sc.close();
					java.lang.System.exit(0);
				}
				System.out.print("\n");

			}	   }
	}

