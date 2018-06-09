package com.learn.threads;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CubbyHole c=new CubbyHole();
		Producer p=new Producer(c);
		Consumer cc=new Consumer(c);
		p.start();
		cc.start();
		
		
	}

}
