package com.learn.ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
	//arithmetic exception
  try{  int number=10/0;
	System.out.println(number);
	
	//null pointer exception
	String s="";
	System.out.println(s.length());
	
	//number format exception
	String s1="abcd";
	int a=Integer.parseInt(s1);
	System.out.println(a);
	
	//array index out of bound exception
	int array[]=new int[5];
	array[6]=30;
	System.out.println(array[6]);}

	catch(ArithmeticException e){
		System.out.println(e);
	}
    catch(NullPointerException e){
    	System.out.println(e);
    }
    catch(NumberFormatException e){
    	System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException e){
    	System.out.println(e);
    }
    	System.out.println("hii the exception is catched");
    	
    }
	}


