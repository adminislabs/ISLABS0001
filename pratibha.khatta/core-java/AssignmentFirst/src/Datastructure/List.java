package Datastructure;

public class List 
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		//constructor to the node
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
    public static void main(String args[])
   {
	 List emptyList = new List();
	 // creating nodes
	 emptyList.head=new Node(10);
	 Node secondnode = new Node(20);
	 Node thirdnode = new Node (30);
	 emptyList.head.next=secondnode;
	 emptyList.head.next.next=thirdnode;
	 emptyList.printLinkedList();
   }
 
    private void printLinkedList()
    {
	  Node tempnode = head;
	  while(tempnode != null)
	  {
		 System.out.println(tempnode.data + "");
		 
		 
	     tempnode = tempnode.next;
	   }   
   }
}
