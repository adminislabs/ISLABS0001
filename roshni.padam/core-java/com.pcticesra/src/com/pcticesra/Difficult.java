package com.pcticesra;

public class Difficult extends Simple {
	void eat() {
		System.out.println("eating");
		super.eat();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Difficult dd=new Difficult();
		dd.eat();
		
	}

}
