 package com.learn.inheritance;

public class TestCalculator {

	public static void main(String[] args) {
		ScientificCalculator cal= new ScientificCalculator();
		
		System.out.println(cal.sum(1,3,4,5,6,6));
		System.out.println(cal.sum(1,2));
		
	}

}
