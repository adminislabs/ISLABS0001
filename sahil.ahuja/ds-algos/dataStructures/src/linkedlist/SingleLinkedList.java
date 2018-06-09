package linkedlist;

public class SingleLinkedList {
	int data;
	SingleLinkedList next;
	public SingleLinkedList insertAtFirst(SingleLinkedList head,int data){
		/*if(head==null){
			SingleLinkedList temp= new SingleLinkedList();
			temp.next=null;
			temp.data=data;
			head=temp;
			return head;
		}*/
		SingleLinkedList temp= new SingleLinkedList();
		temp.data=data;
		temp.next=head;
		head=temp;
		return head;
	}
	public SingleLinkedList deletionAtFirst(SingleLinkedList head){
		/*if(head==null){
			System.out.println("Sorry cant delete empty linked list");
			return;
		}*/
		System.out.println("The deleted element is "+ head.data);
		head=head.next;
		return head;
	}
	public void printElements(SingleLinkedList head){
	/*	if(head==null){
			System.out.println("how can u print the empty linked list");
		}*/
		SingleLinkedList temp;
		temp=head;
		while(temp.next!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
