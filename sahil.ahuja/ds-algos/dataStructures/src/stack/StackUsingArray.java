package stack;

import java.util.Scanner;

public class StackUsingArray {
	int[] stack=new int[10];
	int top=-1;
	public void  push(int elementToBePushed){
		if(isStackFull()){
			System.out.println("Stack is full");
			return;
		}
		top=top+1;
		stack[top]=elementToBePushed;
		System.out.println("ur element is pushed");
	}
	public  boolean isStackFull(){
		if(top==9){
			return true;
		}
		return false;
	}
	public void pop(){
		if(isStackEmpty()){
			System.out.println("Stack is empty. Please first push some elements into stack");
			return ;
		}
		int  elementPoped=stack[top];
		System.out.println("your element is poped and the vaue is"+ elementPoped);
		top=top-1;
		
	}
	public  boolean isStackEmpty(){
		if(top==-1){
			return true;
		}
		return false;
	}
	public  void printElements(){
		for(int i=0;i<=top;i++){
			System.out.println(stack[i]);
		}
	}
	

}
