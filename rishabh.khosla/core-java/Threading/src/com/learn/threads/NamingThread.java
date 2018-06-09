package com.learn.threads;

public class NamingThread extends Thread{
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamingThread T1=new NamingThread();
		NamingThread T2=new NamingThread();
		NamingThread T3=new NamingThread();
		NamingThread T4=new NamingThread();
		NamingThread T5=new NamingThread();
		T1.start();

		T2.start();
		T3.start();
		T4.start();
		T1.setPriority(Thread.MAX_PRIORITY);
		T2.setPriority(Thread.MIN_PRIORITY);
		

	}

}
