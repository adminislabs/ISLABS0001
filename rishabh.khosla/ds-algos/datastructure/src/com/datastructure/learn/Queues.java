package com.datastructure.learn;

public class Queues {
 int capacity;
 int arr[];
 int front=0;
 int rear=-1;
 int currentsize=0;
 
 public Queues(int queueSize){
     this.capacity = queueSize;
     arr = new int[this.capacity];
 }
 
 
 void enqueue(int item){
	 if(isQueueFull()){
		 System.out.println("overflow");}
		 else{
			 rear++;
			 if(rear==capacity-1){
				 
				 rear=0;
			 }
			 arr[rear]=item;
			 currentsize++;
			 System.out.println(item);
		 
		 
	 }
	 
 } 
 void dequeue(){
	 if(isQueueempty()){
		 System.out.println("nothing to delete");}
		 else{
			 front++;
			 if(front==capacity-1){
				 System.out.println("pop done"+arr[front-1]);
				 front=0;}
			 else{
				 System.out.println("pop done "+arr[front-1]);
				 
			 
		 }
			 currentsize--;
		 
		 
	 }
	 
 }
 
 
 
 
 
	
	
	private boolean isQueueempty() {
	if (currentsize==0){
		return true;
		
	}
	return false;
}
	private boolean isQueueFull() {
	// TODO Auto-generated method stub
		boolean status=false;
		if (currentsize==capacity)
	return true;
		return status;
}


	public static void main(String[] args) {
		
		Queues rr=new Queues(5);
		rr.enqueue(4);
		rr.enqueue(1);
		rr.enqueue(2);
		rr.enqueue(3);
		
		
		
	

	}

}
