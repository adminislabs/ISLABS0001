package com.datastructure.learn;

public class Stacks {
   static final int max=1000;
   int top;
   int a[]=new int[max];
   boolean isEmpty(){
	   return(top<0);
	    }
       Stacks(){
    	   top=-1;   
       }
       void  push(int x){
        	if(top>=max){
        		System.out.println("stack overflow");
        	}
        	else
        	{
        		a[++top]=x;
        		
        		System.out.println(x);
        		
        	}
        	
        	}
       int pop(){
    	   if(top<0){
    		   System.out.println("stacks underflow");
    		   return 0;
    	   }
    	   else
    	   {
    		   int x=a[top--];
    		   
    		   return x;}
    		   
    	  
       }
    	   
void print(){
	
	for(int i=0;i<=top;i++){
		System.out.println(a[i]);
	}
}
    	  
       

        

       
   
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stacks s=new Stacks();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		s.pop();
		System.out.println();
		System.out.println("after the 2 pop elements array looks like");
		s.print();
	
		
		
		
	
	}

}
