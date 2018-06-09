package com.rosh;

public class Test {
	public static void main(String args[]) {
	Cubbyhole c=new Cubbyhole();
	
	
	Producer pp=new Producer(c);
	Consumer cc=new Consumer(c);
	
	pp.start();
	cc.start();
	}
	
	

}
