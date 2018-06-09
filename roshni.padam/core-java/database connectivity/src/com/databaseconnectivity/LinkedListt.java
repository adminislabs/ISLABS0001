package com.databaseconnectivity;

public class LinkedListt {
	node head;
	
	
	
    class  node{
    	 
    	 int data;
    	 node rishi;
    	 node(int item){
    		data=item;
    		 rishi=null;
    		 
    	 }
    	 
    	 
    	 
    	 
    	 
     }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListt rr=new LinkedListt();
		rr.head = new node(1);
		node second =new node(2);
		node third=new node(3);
	
		rr.head.rishi=second;
		second.rishi=third;
		
		

	}

}
