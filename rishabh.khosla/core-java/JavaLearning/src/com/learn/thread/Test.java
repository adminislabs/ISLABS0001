package com.learn.thread;

public class Test {

	public static void main(String[] args) {
		
		Bukket b=new Bukket();
		Producer p=new Producer(b);
		Consumer c1=new Consumer(b);
		Consumer c2=new Consumer (b);
		c1.setName("c1");
		c2.setName("c2");
		
		p.start();
		c1.start();
		c2.start();
		c1.getName();
		
		
		
		

	}

}
