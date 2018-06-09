package com.rosh;

import java.math.BigDecimal;

public class Boxing {

	public static void main(String[] args) {
		int number=5;
		Integer i=new Integer(number);
		System.out.println("rrrrrrrrrrrri"+i);
		// TODO Auto-generated method stub
		
		String r="6";
		int a=Integer.parseInt(r);
		
		System.out.println("dfdf"+r);
		
		String k="133.24";
		System.out.println("dnks "+new BigDecimal(k));
		
		float f= (float) 0.2;
		float z=new Float(f);
		System.out.println("fyfh"+f);
		
		
				
		

	}

}
