package queue;

import java.util.Scanner;

import linkedlist.SingleLinkedList;

public class QueueUsingLinkedListExample {

	public static void main(String[] args){
		QueueUsingLinkedList front =new QueueUsingLinkedList();
		QueueUsingLinkedList rear =front;
		while(true)
		{
			System.out.println("Enter Your Choice");
			System.out.println("1. Insert the element in queue(linkedlist) ");
			System.out.println("2. Delete the element from queue(linked list) ");
			System.out.println("3. Print the elements of queue(linked list) ");
			System.out.println("4. Exit ");
			Scanner sc =new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the element to be inserted");
				int elementToBeInserted=sc.nextInt();
				rear=rear.insertion(rear, elementToBeInserted);
                break;
			case 2:
				front=front.deletion(front);
				
				break;
			case 3:
				System.out.println("linked list elements are");
				front.printElements(front);
				break;
			case 4:
				java.lang.System.exit(0);
				
			}
			
		}
		
	}
}
