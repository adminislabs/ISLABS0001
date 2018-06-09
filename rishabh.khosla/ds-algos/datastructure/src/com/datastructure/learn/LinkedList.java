package com.datastructure.learn;

public class LinkedList {
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
	
	public void add(){
		Node newNode=new Node(0);
		newNode.next=head;
		head=newNode;
	}
	
	
	public void addEnd(){
		Node NewEnd=new Node(5);
		Node last=head;
		if(head==null){
			head=NewEnd;
			return;
		}
		while(last.next!=null){
			last=last.next;
		}
		last.next=NewEnd;
		return;
		
	}
	public void delete(){
		
		if(head==null){
			System.out.println("linked list is empty");}
			else if(head.next==null){
				
				head=null;
			}
			else{
				
			
		
		
	
		head=head.next;	
			}
	}
	
	
	
	
	public static void main(String args[]){
		LinkedList rishi=new LinkedList();
		rishi.head=new Node(1);
		Node Second=new Node(2);
		Node third=new Node(3);
		rishi.head.next=Second;
		Second.next=third;
		rishi.add();
		rishi.addEnd();
		rishi.delete();
		rishi.print();
		
		
	}
	}
