package tree;

import java.util.Scanner;

public class BinarySearchTreeExample {
    
	public static void main(String[] args) {
		 BinarySearchTree bst=new BinarySearchTree();
	   //  Node root=new Node();
		while(true){
			System.out.println("Enter ur choice");
			System.out.println("1.Want to insert element");
			System.out.println("2.Print the inorder traversal of tree");
			System.out.println("3.Print the preorder traversal of tree");
			System.out.println("4.Print the postorder traversal of tree");
			System.out.println("5.Want to search any element in tree");
			System.out.println("6.Exit");
			Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the element to be inserted");
				int item=sc.nextInt();
				bst.insertrec(item);
				break;
			case 2:
				bst.inorderTraversal();
				break;
			case 3:
				bst.preorderTraversal();
				break;
            case 4:
				bst.postorderTraversal();
				break;
            case 5:
            	System.out.println("Enter the element u want to search");
            	int element=sc.nextInt();
            	bst.searchElement(element);
            	break;
			case 6:
				java.lang.System.exit(0);
			}
			
		}

	}

}
