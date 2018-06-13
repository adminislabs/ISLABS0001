package com.datastructure.Struct;

public class Queues {

	int front=0;
	int rear=-1;
	int currentsize=0;
	static int capacity =10;
	int arr[]=new int[capacity];
	
	void enqueue(int item){
		if(currentsize>capacity){
			System.out.println("no space to add element");
			
		}
		else{
			rear++;
			if(rear==capacity-1){
				rear=0;
			}
			arr[rear]=item;
			currentsize++;
			System.out.println("the added item is"+item);	
		}	
	}
	
	void dequeue(){
		if(currentsize<=0){
			System.out.println("no item is dere to remove");
			
		}
		else{
			front++;
			if(front==capacity-1){
				System.out.println(arr[front-1]);
				front=0;
				currentsize--;
			}
			else{
				System.out.println(arr[front-1]);
				currentsize--;
			}	
		}		
	}
	
	public static void main(String[] args) {
		
		Queues q=new Queues();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.dequeue();
		
		
		
		

	}

}
