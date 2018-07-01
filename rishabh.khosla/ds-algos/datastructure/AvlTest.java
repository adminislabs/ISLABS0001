package Tree.avl;

import java.util.Scanner;
/**
 * create a class AvlTest  to check the implementation of our program
 * @author rishab
 *
 */
public class AvlTest {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AvlTree avlt = new AvlTree(); 
        System.out.println("AVLTree Tree Test\n");          
        char ch;
        while(true)    
        {
            System.out.println("\nAVLTree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. check empty");
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                avlt.insert( scan.nextInt() );                     
                break;                          

            case 2 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ avlt.search( scan.nextInt() ));
                break;                                          

            case 3 : 
                System.out.println("Empty status = "+ avlt.isEmpty());
                break;     

            default : 
                System.out.println("Wrong Entry \n ");
                break;   

            }
        }}
}

	


