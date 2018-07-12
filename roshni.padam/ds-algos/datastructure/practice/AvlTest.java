package com.practice;
/**
 * class AvlTest is created to check 
 * all the functions created in avl tree class
 */
import java.util.Scanner;
public class AvlTest {
	public static void main(String[] args) {
		AvlTree avl=new AvlTree();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Select options for Avl functionalities");
			System.out.println("1. select for insert operation");
			System.out.println("2. select for inorder  traversel operation");
			System.out.println("3. select for preorder traversel operation");
			System.out.println("4. select for postorder traverseloperation");
			System.out.println("5. select for finding minimum element");
			System.out.println("6. select for finding maximum element");
			System.out.println("7. exit");
			int choice= scan.nextInt();
			switch (choice) {
            case 1:
                System.out.println("Enter the element to be inserted");
                int data = scan.nextInt();
                AvlNode roota = avl.getRoot();
                avl.setRoot(avl.insert(roota, data));
                System.out.println("your element is inserted ");
                break;
            case 2:
                System.out.println("Inorder traversel");
                AvlNode rootb = avl.getRoot();
                avl.inorder(rootb);
                break;
            case 3:
                System.out.println("Preorder traversel");
                AvlNode rootc = avl.getRoot();
                avl.preorder(rootc);
                break;
            case 4:
                System.out.println("Postorder traversel");
                AvlNode rootd = avl.getRoot();
                avl.postorder(rootd);
                break;
            case 5:
            	AvlNode roote = avl.getRoot();
            	System.out.println("Minimum element "+" "+avl.minValue(roote));
            	break;
            case 6:
            	AvlNode rootf = avl.getRoot();
            	System.out.println("Maximum element "+" "+avl.maxValue(rootf));
            	break;
            case 7:
            	scan.close();
            	java.lang.System.exit(0);
			}
			System.out.print("\n/");
		}
	}
	}