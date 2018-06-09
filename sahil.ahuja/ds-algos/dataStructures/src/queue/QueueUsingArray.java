package queue;

public class QueueUsingArray {
	int[] queue=new int[10];
	int front=0;
	int rear=-1;
	public void insertion(int elementToBeInserted){
		if(isQueueFull()){
			System.out.println("Queue is full");
			return;
		}
		rear=rear+1;
		queue[rear]=elementToBeInserted;
		System.out.println("ur element is inserted");
	}
	public boolean isQueueFull(){
		if(rear==9){
			return true;
		}
		return false;
	}
	public void deletion(){
		if(isQueueEmpty()){
			System.out.println("Ur queue is Empty");
			return ;
		}
		int elementDeleted=queue[front];
		System.out.println("your element is poped and the value is"+ elementDeleted);
		front++;
		
	}
	public boolean isQueueEmpty(){
		if(front==rear+1){
			return true;
		}
		return false;
	}

	public void printElements(){
		for(int i=front;i<=rear;i++)
			System.out.println(queue[i]);
	}
	
}
