package Boxing;
import java.util.Scanner;
public class BinarySearchTree 
/** Binary Search tree class contain object of binary searchtree main method contain switch having case 
 * cases for insertion ,deletion
 */
{ 
	 public static void main(String[] args)
	 {                 
	        Scanner scan = new Scanner(System.in);
	        BinarySearchMain bst = new BinarySearchMain(); 
	        System.out.println("Binary Search Tree Test\n");          
	        Node root= bst.getRoot();
	        char ch;
	        /*  Perform tree operations  */
	        while(true)    
	        {
	            System.out.println("\nBinary Search Tree Operations\n");
	            System.out.println("1.Insert ");
	            System.out.println("2.Preorder Traversal");
	            System.out.println("3.Inorder Traversal");
	            System.out.println("4.Postorder Traversal");
	            System.out.println("5.Search");
	            System.out.println("6.Delete");
	            System.out.println("7.Exit");
	            
	            int choice=scan.nextInt();
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Enter integer element to insert");
	                int value=scan.nextInt();
	                bst.insertNode( root,value );                     
	                break;                          
	            
	            case 2:
	                System.out.print("\nPost order : ");
	                bst.postorder(root);
	                break;
	            case 3:
	            	
	                System.out.print("\nPre order : ");
	                bst.preorder(root);
	                break;
	            case 4:
	                System.out.print("\nIn order : ");
	                bst.inorder(root);
	                break; 
	            case 5 : 
	                System.out.println("Enter integer element to search");
	                value=scan.nextInt();
	                bst.searchNode( value,root );        
	                break; 
	            case 6 :
	            	System.out.println("Enter element you want to delete");
	            	value=scan.nextInt();
	            	bst.deleteNode(root, value);
	            case 7:
						java.lang.System.exit(0);
	            
	            }
	        }
	        
	        
	 }
	     

}
