package boxing;

import java.math.BigDecimal;

public class Boxing {

	public static void main(String[] args) {
		int i=5;
		int j=Integer.valueOf(i);
		System.out.println("Boxing of integer i="+i+ " in j="+ j);
        String num="123";
        int num1=Integer.parseInt(num);
        System.out.println("Parsing string num="+num+" into integer num1="+num1);
        String bg="138.90";
        System.out.println("Parsing string bg="+bg+" into Bigdecimal="+new BigDecimal(bg));
	    float f=4.5f;
	    float g=Float.valueOf(f);
	    System.out.println("Boxing of float primitive f="+f+" into class Float g="+g);
	    
	}

}
