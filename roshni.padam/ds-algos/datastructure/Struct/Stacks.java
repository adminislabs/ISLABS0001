package com.datastructure.Struct;

public class Stacks {
int top=-1;
static int  maxsize=10;
int arr[]=new int[maxsize];


void push(int item){
	if(top>=maxsize){
		System.out.println("space is not dere");
	}
	arr[++top]=item;
	System.out.println("the number added is:"+""+item);
	
}
  int pop(){
	  if(top<0){
		 System.out.println("no item is dere to remove"); 
		 return 0;
	  }
	  else {
		  int item=arr[top--];
	  
	return item;}
  }
  void print(){
		
		for(int i=0;i<=top;i++){
			System.out.println(arr[i]);
		}
	}
	    	  
	
	
	public static void main(String[] args) {

		Stacks s=new Stacks();
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
			s.push(5);
			s.pop();
			s.pop();
			s.print();


	}

}
