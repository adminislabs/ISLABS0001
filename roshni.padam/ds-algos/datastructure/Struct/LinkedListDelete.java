package com.datastructure.Struct;

public class LinkedListDelete {
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
			System.out.print(current.data+"--");
			current=current.next;
		}
	}
	//delete first node
	void deleteFirst(){
		head=head.next;
	
		
	}
	//delete at end node
	void deleteLast(){
		Node prev=null;
		Node current=head;
		while(current.next!=null){
			current.next=current;
			prev=current;	
			prev.next=null;
		}
	
		
	}

	public static void main(String[] args) {
		LinkedListDelete list=new LinkedListDelete();
		list.head=new Node(1);
		Node Second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		list.head.next=Second;
		Second.next=third;
		third.next=fourth;
		list.deleteFirst();
		list.deleteLast();
		list.print();
		
		
		
		
		
		
	}
}
