package Datastructure;

public class Stack 
{
	private static final int capacity = 3;  
	 int arr[] = new int[capacity];  
	 int top = -1;  
	  
	 public void push(int pushedElement) {  
	  if (top < capacity - 1) {  
	   top++;  
	   arr[top] = pushedElement;  
	   System.out.println("Element " + pushedElement  
	     + " is pushed to Stack !");  
	   printElements();  
	  } else {  
	   System.out.println("Stack Overflow !");  
	  }  
	 }  
	  
	 public void pop() {  
	  if (top >= 0) {  
	   top--;  
	   System.out.println("Pop operation done !");  
	  } else {  
	   System.out.println("Stack Underflow !");  
	  }  
	 }  
	  
	 public void printElements() {  
	  if (top >= 0) {  
	   System.out.println("Elements in stack :");  
	   for (int i = 0; i <= top; i++) {  
	    System.out.println(arr[i]);  
	   }  
	  }  
	 }  
	  
	 public static void main(String[] args) {  
	  Stack stack= new Stack();  
	  
	  stack.pop();  
	  stack.push(23);  
	  stack.push(2);  
	  stack.push(73);  
	  stack.push(21);  
	  stack.pop();  
	  stack.pop();  
	  stack.pop();  
	  stack.pop();  
	 }  
	  
	}  

