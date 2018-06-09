package com.learn.threads;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Clothing rishi=new Clothing();
Factory jj =new Factory(rishi);
Customer cc=new Customer(rishi);

  Thread rishii=new Thread(jj);
 rishii.setName("the clothes factory producer");

Thread brx=new Thread(cc);
brx.setName("hey i wanna  ice creamer ");

		rishii.start();
		brx.start();
		
	}

}
