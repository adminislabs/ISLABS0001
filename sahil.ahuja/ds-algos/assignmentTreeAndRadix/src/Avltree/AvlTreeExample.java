package Avltree;

import java.util.Scanner;

/**
 * 
 * @author sahil This class has the main method and performs the operations on
 *         avl tree such as insertion, deletion, traversals and searching
 */
public class AvlTreeExample {

	public static void main(String[] args) {
		AVLTree avl = new AVLTree();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter ur choice");
			System.out.println("1.Want to insert element");
			System.out.println("2.Print the inorder traversal of tree");
			System.out.println("3.Print the preorder traversal of tree");
			System.out.println("4.Print the postorder traversal of tree");
			System.out.println("5.Want to print balance factor of root");
			System.out.println("6.Want to search element");
			System.out.println("7.want to delete the element");
			System.out.println("8.Exit");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element to be inserted");
				int item = sc.nextInt();
				Node root4 = avl.getRoot();
				avl.setRoot(avl.insert(root4, item));
				System.out.println("ur element inserted ");
				break;
			case 2:
				Node root = avl.getRoot();
				avl.inorder(root);
				break;
			case 3:
				Node root1 = avl.getRoot();
				avl.preOrder(root1);
				break;
			case 4:
				Node root2 = avl.getRoot();
				avl.postorder(root2);
				break;
			case 5:
				Node root3 = avl.getRoot();
				int balance = avl.getBalance(root3);
				System.out.println(balance);
				break;
			case 6:
				System.out.println("Enter the element");
				int item1 = sc.nextInt();
				Node root6 = avl.getRoot();
				int item3 = avl.search(root6, item1);
				if (item1 == item3) {
					System.out.println("yes " + item1);
				} else {
					System.out.println("No, ur element not found ");
				}

				break;
			case 7:
				System.out.println("Enter the element to be deleted");
				int item2 = sc.nextInt();
				Node root5 = avl.getRoot();
				if (item2 == avl.search(root5, item2)) {
					root5 = avl.delete(root5, item2);
					System.out.println("ur item is deleted");
				} else {
					System.out.println("ur elemented not found");
				}
				break;
			case 8:
				sc.close();
				java.lang.System.exit(0);
			}
			System.out.print("\n");

		}

	}

}
