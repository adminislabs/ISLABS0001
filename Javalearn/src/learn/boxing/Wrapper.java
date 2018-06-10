package learn.boxing;

import java.math.BigDecimal;

public class Wrapper {

	public static void main(String[] args) {
		int number=8;
		Integer i=new Integer(number);
		System.out.println("the conversion of integer  to its primitive datatype:"+i);
		
		String s="15";
		int n=Integer.parseInt(s);
	
		System.out.println("the conversion of string to integer is : "+n);
	
		String s2="10.45";
		System.out.println("conversion of string to bigdecimal is : "+new BigDecimal(s2));
		
		float f=(float) 0.5;
		Float f1=new Float(f);
		System.out.println("the boxing of float is :"+f1);
	}

	}


