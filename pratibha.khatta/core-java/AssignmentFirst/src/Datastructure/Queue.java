package Datastructure;

public class Queue 
{
	private int capacity = 3;
	int arr[]=new int[capacity];
	
	int top=-1;
	
  public void push(int pushedElement)
  {
	  if(top<capacity-1)
	  {
		  top++;
		  arr[top]=pushedElement;
		  
	  }
	  
  }
}
