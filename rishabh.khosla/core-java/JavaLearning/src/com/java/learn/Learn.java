package com.java.learn;

public class Learn {
	
	int capacity=50;
	int arr[]=new int[capacity];
	int front =0;
	int back=-1;
	int size=0;
	
	void enqueue(int item){
		if(isqueuefull()){
			System.out.println("overflow");}
		
			else{
				back++;
				if(back==capacity-1){
					back=0;
			}
				arr[back]=item;
				size++;
				System.out.println(item);	
		}	
	}
	
	
	private boolean isqueuefull() {
		boolean status=false;
		if(size==capacity)
		return true;
		return status;
		
	}

	
	public static void main(String args[]){
		Learn l=new Learn();
		l.enqueue(1);
		l.enqueue(3);
		l.enqueue(5);
		
	}
	
	
}
