package com.datastructure.learn;

import com.datastructure.learn.LinkedList.Node;

public class StacklinkedList {
	Node head;
	 static class Node{
		int data;
		Node nxt;
		Node(int data){
			this.data=data;
			nxt=null;
			}
	}
	 void push(int x){
		Node newnode=new Node(x);
		newnode.nxt=head;
		head=newnode;
		 
		 
	 }
	 
	 Node pop(){
		 
		 head=head.nxt;
		return head;
		
		 
		
	 }
	 void print(){
		 Node current=head;
			while(current!=null){
				System.out.print(current.data+"--");
				current=current.nxt;
			}
		 
	 }
	 
	 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StacklinkedList rr=new StacklinkedList();
		rr.push(1);
		rr.push(2);
		rr.push(3);
		rr.push(4);
		rr.print();
		rr.pop();
		System.out.println();
		System.out.println("after pop things r:");
		rr.print();
		
		
		
		
	}

}
