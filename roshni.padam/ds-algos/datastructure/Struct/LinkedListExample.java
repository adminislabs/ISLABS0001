package com.datastructure.Struct;

public class LinkedListExample {
 node head;
 static class node{
	 int data;
	 node next;
	 
	 node(int data){
		 this.data=data;
		 next=null;
	 }
    }
    void print(){
    	node current=head;
    	while(current!=null){
    		System.out.println(current.data);
    		current=current.next;
    	}
    	
    }
 
	
	
	
	public static void main(String[] args) {
		LinkedListExample list=new LinkedListExample();
		1ist.head=new node(1);
		node n2=new node(2);
		node n3=new node(3);
		node n4=new node(4);
		
		list.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		list.print();
		
		
		
	}
}
