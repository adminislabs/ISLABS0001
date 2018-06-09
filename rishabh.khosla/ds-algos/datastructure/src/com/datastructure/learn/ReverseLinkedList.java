package com.datastructure.learn;

public class ReverseLinkedList {
	static Node head;
  static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
			next=null;	
		}	
	}
  
   public void print(){
	   Node current=head;
	   while(current!=null){
		   System.out.print("...-"+current.data);
		   current=current.next;
		
	   }
	   System.out.println(current);
   }
		   
   public Node reverse(Node node){
	   Node current=node;
	   Node previous =null;
	   Node nxt=null;
	   while(current!=null){
		   nxt=current.next;
		   current.next=previous;
		   previous=current;
		   current=nxt;
		   
		  
	   }
	   node= previous;
	   
	   return node;
	   
	   
	   
   }
   
   
  
	public static void main(String[] args) {
		ReverseLinkedList nn=new ReverseLinkedList();
		nn.head=new Node(1);
		Node first=new Node(2);
		Node second=new Node(3);
    Node third	=new Node(4);
		Node fourth=new Node(5);
		
		nn.head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		
		nn.print();
		System.out.println("the linked list after traversal is:");
		head=nn.reverse(head);
		nn.print();
		
		
		
		

	}

}
