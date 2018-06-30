package learn;

import java.util.Scanner;

/**
 * For test the code
 * 
 * @author roshni
 *
 */

    public class Test {
    public static void main(String args) {
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
                tree.inorder(root);
                break;
            case 3:
                tree.preorder(root);
                break;
            case 4:
                tree.postorder(root);
                break;
            case 5:
                tree.height(root);
                break;
            case 6:
                java.lang.System.exit(0);
}}}}



