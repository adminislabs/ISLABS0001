package com.datastructure.learn;

public class NodeDelete {
	Node head;
	 int data;
	static class Node {
		int data;
		Node next;
	
		
		Node(int data){
			
			this.data=data;
			next=null;	
	}
	}
	  void print(){
		  Node current=head;
		  while(current!=null){
			  System.out.print(".."+current.data);
			  current=current.next;  
		  }  
	  }
	  void delete(){
		  if(head==null){
			  System.out.println("there is no node to delete");
			  
		  }
		  else
		  {
			 head=head.next;
		  }
		

	  }
	  
	  void DeleteEnd(){
		  Node rishi=null;
		  Node temp=head;
		  while(temp.next!=null){
			  temp=temp.next;
			  rishi=temp;
			  temp.next=null;
			  
			  
			  
			  
		  }
		  
		 
		  
	  }
	  
	  
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeDelete link=new NodeDelete();
		link.head=new Node(1);
		Node first=new Node(2);
		Node seond=new Node(3);
	    Node third=new Node(4);
		Node fourth=new Node(5);
		
		link.head.next=first;
		first.next=seond;
		seond.next=third;
		third.next=fourth;
		System.out.println("the linked list created is:");
		link.print();
		link.delete();
		System.out.println();
		System.out.println("after delete first node linked list is:");
		link.print();
		link.DeleteEnd();
		System.out.println();
		System.out.println("after delete last node:");
		link.print();
		
		

	}

}
