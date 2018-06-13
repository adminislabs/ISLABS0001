package com.datastructure.Struct;

public class LinkedListOperations {
    Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
	
		}}
	
	public void print(){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+"----");
			current=current.next;
		}
	}
	//add new node at the first place   
	void addFirst(){
		Node n1=new Node(0);
		n1.next=head;
		head=n1;	
	}
	// add new node at the end place
	void addlast(){
		Node n2=new Node(6);
		Node current=head;
		while(current.next!=null){
			current=current.next;
		}
		current.next=n2;
		n2.next=null;
	}
	// add new at the 3rd place 
	void addPosition(){
		Node n3=new Node(111);
		Node current=head;
		Node prev=null;
		int key=3;
		 int i = 0;
		    while (current !=null && i < key) {
		       prev=current;
		       current=current.next;
		       i++;
		    }
		    prev.next=n3;
		    n3.next=current;	    
	}
	

	public static void main(String[] args) {
		LinkedListOperations list=new LinkedListOperations();
		list.head=new Node(1);
		Node Second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		list.head.next=Second;
		Second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		list.addFirst();
		list.addlast();
		list.addPosition();
		list.print();
		
	}
	

}
