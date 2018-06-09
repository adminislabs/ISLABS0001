package com.learn.inheritance;

public class ScientificCalculator extends BasicCalculator{
	
	public int sum(int... num){
	int sum=0;
		for(int i=0;i<num.length;i++){
			sum=sum+num[i];
	}
		return sum;
		
	}
	public int multiply(int... num){
		int mul=1;
		for(int i=0;i<num.length;i++){
			mul=mul*num[i];
		}
			
		return mul;
	}
	public int divide(int...num){
		int result=1;
	int div=num[0];
		for(int i=1;i<num.length;i++){
			result=div/num[i];
		}
		return result;
		
	}
	

}
