package com.thread;

public class Namingthread extends Thread {
	
	
	public void run() {
	System.out.println(Thread.currentThread().getName());

}
	public static void main(String[] args) {
		Namingthread t1=new Namingthread();
		Namingthread t2=new Namingthread();
		Namingthread t3=new Namingthread();
		Namingthread t4=new Namingthread();
		Namingthread t5=new Namingthread();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);
		// TODO Auto-generated method stub

	}

}
