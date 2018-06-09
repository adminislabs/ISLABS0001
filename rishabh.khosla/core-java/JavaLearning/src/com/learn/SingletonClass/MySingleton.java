package com.learn.SingletonClass;

public class MySingleton {
	//done with constructor set as a private 
	private static MySingleton obj;
	
	private MySingleton(){
		
		
	}
	// static method to get instance 
	public static MySingleton getInstance(){
		if(obj==null){
			obj=new MySingleton();
		}
		
		return obj;
		
	}
	void print(){
		System.out.println("verification of object create ");
		
	}
	
	
	public static void main(String[] args) {
		MySingleton ss=MySingleton.getInstance();
		ss.print();

	}

}
