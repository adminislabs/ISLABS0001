package linkedlist;

import java.util.Scanner;

//import queue.QueueUsingArray;

public class SingleLinkedListExample {
	
	public static void main(String[] args){
		SingleLinkedList head =new SingleLinkedList();//new SingleLinkedList();
		while(true)
		{
			System.out.println("Enter Your Choice");
			System.out.println("1. Insert the element in linked list ");
			System.out.println("2. Delete the element from linked list ");
			System.out.println("3. Print the elements of linked list ");
			System.out.println("4. Exit ");
			Scanner sc =new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the element to be inserted");
				int elementToBeInserted=sc.nextInt();
				head=head.insertAtFirst(head,elementToBeInserted );
                break;
			case 2:
				head=head.deletionAtFirst(head);
				
				break;
			case 3:
				System.out.println("linked list elements are");
				head.printElements(head);
				break;
			case 4:
				java.lang.System.exit(0);
				
			}
			
		}
		
	}
}
