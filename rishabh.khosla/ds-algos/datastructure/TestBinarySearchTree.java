package learn;

import java.util.Scanner;

/**
 * this class is created to check or test the features created in our binarySearchTree Implementation
 * @author rishab
 *
 */
public class TestBinarySearchTree {

	public static void main(String[] args) {	
		BinarySearchTree tree=new BinarySearchTree();
		Node root=tree.getRoot();
		
			while(true){
				System.out.println("Enter ur choice");
				System.out.println("1.Want to insert element");
				System.out.println("2.Print the inorder traversal of tree");
				System.out.println("3.Print the preorder traversal of tree");
				System.out.println("4.Print the postorder traversal of tree");
				System.out.println("5.Want to calculate  height of tree");
				System.out.println("6.Want to calculate  minimum value of the Binary tree");
				System.out.println("7.Want to calculate  maximum value of the Binary tree");
				System.out.println("8.Exit");
				Scanner sc=new Scanner(System.in);
	            int choice=sc.nextInt();
				switch(choice){
				case 1:
					System.out.println("Enter the element to be inserted");
					int item=sc.nextInt();
					tree.insert(root,item);
					break;
				case 2:
					Node root2=tree.getRoot();
					tree.inorder(root2);
					break;
				case 3:
					Node root3=tree.getRoot();
					tree.preorder(root3);
					break;
	            case 4:
	            	Node root4=tree.getRoot();
					tree.postorder(root4);
					break;
	            case 5:
	            	Node root5=tree.getRoot();
	            	tree.height(root5);
	            	break;
	            case 6:
	            	tree.findMin(root);
	            	break;
	            case 7:
	            	tree.findMax(root);
	            	break;	
				case 8:
					java.lang.System.exit(0);
	}}}}


