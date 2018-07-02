package com.avltree;

import java.util.Scanner;

/**
 * create test class to check the avl tree
 * 
 * @author roshni
 *
 */

public class AvlTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AvlTree avlt = new AvlTree();
		System.out.println("AVLTree Tree Test\n");
		char ch;
		while (true) {
			System.out.println("\nAVLTree Operations\n");
			System.out.println("1. insert ");
			System.out.println("2. traverse the tree");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				avlt.insert(null, scan.nextInt());
				break;

			case 2:
				System.out.println("Enter integer element to search");
				System.out.println("Search result : ");
				break;

			case 3:
				System.out.println("Wrong Entry \n ");
				break;

			}
		}
	}

}
