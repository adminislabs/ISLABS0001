package binarySearch;
import java.util.Scanner;
/**
 * 
 * @author sahil This class let u do various functions on binary search tree
 *         such as insertion, inorder traversal, postorder traversal , preorder
 *         traversal, search and delete
 * 
 */

public class BinarySearchTreeExample {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		while (true) {
			System.out.println("Enter ur choice");
			System.out.println("1.Want to insert element");
			System.out.println("2.Print the inorder traversal of tree");
			System.out.println("3.Print the preorder traversal of tree");
			System.out.println("4.Print the postorder traversal of tree");
			System.out.println("5.Want to caalculate  height of tree");
			System.out.println("6.Want to search element");
			System.out.println("7.want to delete the element");
			System.out.println("8.print level order traversal of tree");
			System.out.println("9.print the tree in 2 Dimensions");
			System.out.println("10.Exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element to be inserted");
				int item = sc.nextInt();
				Node root5 = bst.getRoot();
				bst.setRoot(bst.insert(root5, item));
				System.out.println("ur element inserted");
				break;
			case 2:
				Node root = bst.getRoot();
				bst.inorder(root);
				break;
			case 3:
				Node root1 = bst.getRoot();
				bst.preorder(root1);
				break;
			case 4:
				Node root2 = bst.getRoot();
				bst.postorder(root2);
				break;
			case 5:
				Node root3 = bst.getRoot();
				int height = bst.height(root3);
				System.out.println(height);
				break;
			case 6:
				Node root4 = bst.getRoot();
				System.out.println("Enter the element");
				int item1 = sc.nextInt();
				int item3 = bst.search(root4, item1);
				if (item1 == item3) {
					System.out.println("yes " + item1);
				} else {
					System.out.println("No, ur element not found ");
				}
				break;
			case 7:
				System.out.println("Enter the elemnt to be deleted");
				int item2 = sc.nextInt();
				Node root6 = bst.getRoot();
				if (item2 == bst.search(root6, item2)) {
					root6 = bst.delete(root6, item2);
					System.out.println("ur item is deleted");
				} else {
					System.out.println("ur element not found");
				}

				break;
			case 8:
				bst.printLevelOrder();
				break;
			case 9:
				Node rt=bst.getRoot();
				bst.print2dTree(rt);
				break;
			case 10:
				sc.close();
				java.lang.System.exit(0);
			}

		}

	}

}
