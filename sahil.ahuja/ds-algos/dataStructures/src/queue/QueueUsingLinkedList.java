package queue;

public class QueueUsingLinkedList {
    int data;
    QueueUsingLinkedList next;
    public QueueUsingLinkedList insertion(QueueUsingLinkedList rear,int data){
    	QueueUsingLinkedList temp=new QueueUsingLinkedList();
    	temp.data=data;
    	temp.next=null;
    	rear=temp;
    	return rear;
    	}
    public QueueUsingLinkedList deletion(QueueUsingLinkedList front){
    	System.out.println("The deletedd elemented is "+ front.data);
    	front=front.next;
    	return front;
    	
    }
    public void printElements(QueueUsingLinkedList front){
    	QueueUsingLinkedList temp=front;
    	while(temp.next!=null){
    		System.out.println(temp.data);
    		temp=temp.next;
    	}
    }
}
