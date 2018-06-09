package queue;

import java.util.Scanner;

import stack.StackUsingArray;

public class QueueUsingArrayExample {
	public static void main(String[] args){
		QueueUsingArray qua=new QueueUsingArray();
		while(true)
		{
			System.out.println("Enter Your Choice");
			System.out.println("1. Insert the element in Queue ");
			System.out.println("2. Delete the element from Queue ");
			System.out.println("3. Print the elements of Queue ");
			System.out.println("4. Exit ");
			Scanner sc =new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the element to be inserted");
				int elementToBeInserted=sc.nextInt();
				qua.insertion(elementToBeInserted);
				
				break;
			case 2:
				qua.deletion();
				
				break;
			case 3:
				System.out.println("Queue elements are");
				qua.printElements();
				break;
			case 4:
				java.lang.System.exit(0);
				
			}
			
		}
		
	}


}
