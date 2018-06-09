package Datastructure;
import java.util.Scanner;
public class Switch
{
	static int size=5;
	static int arr[]=new int[size];
	static int top=-1;
	@SuppressWarnings("resource")
	public static void main(String args[])
	 {
		 int choice;

			do{
				System.out.println("1.Push");
				System.out.println("2.Pop");
				System.out.println("3.Display");
				System.out.println("4.Quit");
				System.out.println("Enter your choice : ");
				choice =new Scanner(System.in).nextInt();
				switch(choice)
				{
				 case 1 :
					push();
					break;
				 case 2:
					pop();
					break;
				 case 3:
					display();
					break;
				 case 4:
		                        break;
				 default:
					 System.out.println("Wrong choice\n");
				}}while(choice!=4);
	 }



 public static void push()
 {
	 int number;
	 if(top==size-1)
	 {
		 System.out.println("Stack overflow");
	 }
	 else
	 {
		 System.out.println("Enter the element");
		 number=new Scanner(System.in).nextInt();
		 top=top+1;
		 arr[top]=number;
		 
	 }
 }
	 static void pop()
	 {
		 if(top==-1)
			 System.out.println("STack underflow");
		 else
		 {
			 System.out.println("Popped element" + arr[top]);
			 top=top-1;
		 }
		 
	 }
	 static void display()
	 {
		 int loop;
		 if(top==-1)
		 {
			 System.out.println("Stack is empty");
			 
		 }
		 else
		 {
			 System.out.println("Stack elements");
			 for(loop=top;loop>=0;loop--)
			 {
				 System.out.println(+arr[loop]);
			 }
				 
		 }
	 }
	
 }