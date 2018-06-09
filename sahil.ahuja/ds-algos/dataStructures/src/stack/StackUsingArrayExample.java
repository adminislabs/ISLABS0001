package stack;

import java.util.Scanner;

public class StackUsingArrayExample {
	public static void main(String[] args){
		StackUsingArray sua=new StackUsingArray();
		while(true)
		{
			System.out.println("Enter Your Choice");
			System.out.println("1. Push the element into Stack ");
			System.out.println("2. Pop the element from Stack ");
			System.out.println("3. Print the element of Stack ");
			System.out.println("4. Exit ");
			Scanner sc =new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the element to be pushed");
				int elementToBePushed=sc.nextInt();
				sua.push(elementToBePushed);
				break;
			case 2:
				sua.pop();
				break;
			case 3:
				System.out.println("Stack elements are");
				sua.printElements();
				break;
			case 4:
				java.lang.System.exit(0);
				
			}
			
		}
		
	}

}
