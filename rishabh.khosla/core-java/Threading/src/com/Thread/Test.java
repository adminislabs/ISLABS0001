package com.Thread;

public class Test {

	public static void main(String[] args) {
	GunnyBag g=new GunnyBag();
	Producer p=new Producer(g);
	Consumer cc=new Consumer(g);
	Consumer cs=new Consumer(g);

	p.start();
	cc.start();
    cs.start();
	}

}
