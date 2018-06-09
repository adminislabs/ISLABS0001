package com.learn.Wrapper;

import java.math.BigDecimal;

public class Boxing {
	
	public static void main(String args[]){
		int number=5;
		Integer i=new Integer(number);
		System.out.println("the boxing of int to its primitive datatype:"+i);
		
		String s="10";
		int n=Integer.parseInt(s);
	
		System.out.println("the conversion of string to int: "+n);
	
		String s2="10.13";
		System.out.println("conversion of string to bigdecimal: "+new BigDecimal(s2));
		
		float f=(float) 0.5;
		Float f1=new Float(f);
		System.out.println("the boxing of float"+f1);
	}
	

}
