
package com.gndu.rishab;
import com.gndu.rishab.Car;
   public class HelloWorld {
	   
	   void add(int i,int j){
		   System.out.println( i+j);
	   }
	   int add(int a,int b,int c){
		   return a+b+c;
			   
	   }
/*
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Car car=new Car();
		car.move();
		HelloWorld cc=new HelloWorld();
		cc.add(55,77);
		try{int data=30/0;}
		catch(ArithmeticException e){
			e.printStackTrace();
			
			
			
		}
		System.out.println();
	
		
		
		
		
		
		

	}}
	

