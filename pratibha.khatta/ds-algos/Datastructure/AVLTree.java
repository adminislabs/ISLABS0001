import java.util.Scanner;

/**This class contains main method ,object of the class AVLMain and through this class we can call various methods such as insertion,deletion,
 * various traversal of the tree ,searching of particular element and representation of the tree in 2d form
 *
 * @author pratibha
 */
 


public class AVLTree 
{
     public static void main(String args[])
   {
	   AVLMain object=new AVLMain();
	   Scanner scan=new Scanner(System.in);
	   while(true)
	   {
           System.out.println("\nAVL Tree Operations\n");
           System.out.println("Enter choice");
           System.out.println("1.Insert ");
           System.out.println("2.Preorder Traversal");
           System.out.println("3.Inorder Traversal");
           System.out.println("4.Postorder Traversal");
           System.out.println("5.Search");
           System.out.println("6.Delete");
           System.out.println("7.Tree representation");
           System.out.println("8.Exit");
           
           
           int choice=scan.nextInt();
           switch (choice)
           {
           case 1 : 
               System.out.println("Enter integer element to insert");
               int value=scan.nextInt();
               Node root1=object.getRoot();
               object.setRoot(object.insertNode(root1,value ));
               System.out.println("Element" + value+" is inserted");
               break;                          
           
           case 2:
               System.out.println("Preorder : ");
               Node root2=object.getRoot();
               object.postorder(root2);
               break;
           case 3:
           	
               System.out.println("Inorder : ");
               Node root3=object.getRoot();
               object.preorder(root3);
               break;
           case 4:
               System.out.println("Postorder : ");
               Node root4=object.getRoot();
               object.inorder(root4);
               break; 
           case 5 : 
               System.out.println("Enter integer element to search");
               int firstValue=scan.nextInt();
               Node root5=object.getRoot();
               int secondValue=object.searchNode(root5, firstValue);
               if(firstValue==secondValue){
            	   System.out.println("Entered " +firstValue +"element is present");
                  
               }
               else{
            	   System.out.println("Entered" + firstValue+ "element is not present");
               }
               break; 
           case 6 :
           	System.out.println("Enter element you want to delete");
                int delete=scan.nextInt();
           	Node root6=object.getRoot();
           	if(delete==object.searchNode(root6,delete))
           	{
           	
           		root6=object.deleteNode(root6,delete);
           		System.out.println("Element" + delete +"is deleted");
                         System.out.println("Preorder Traversal after deletion:");
                    object.preorder(root6);
                   System.out.println("Inorder Traversal after deletion:");
                    object.inorder(root6);
                   System.out.println("Postorder Traversal after deletion:");
                    object.postorder(root6);
           	}
           	else{
           		System.out.println("Element" +delete+ "is not present in the tree");
            	}
           		
           	break;
             case 7:
                            Node root7=object.getRoot();
                            object.printTree(root7);
                            break;
             case 8:
                            Node root8 = object.getRoot();
 				     int balance = object.balance(root8);
 				     System.out.println(balance);
                                break;
           case 9:
        	        scan.close();
			java.lang.System.exit(0);
           
           }
           			System.out.print("\n");

       }
       
       
}
    


	   
    
}
