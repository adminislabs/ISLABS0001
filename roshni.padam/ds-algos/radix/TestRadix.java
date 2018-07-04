package com.radix;
/**
 * this class is made to test the implementation of radix sort
 * function
 * @author roshni
 *
 */
public class TestRadix {
	
		   public static void main (String[] args)
		    {
		        int array[] = {170, 45, 75, 90, 802, 24, 2, 66};
		        int n = array.length;
		        System.out.println("array before the sort is " +" ");
		        for(int x:array) {
		        	System.out.print(x+" ");
		        }
		        Radix rr= new Radix();
		        rr.radixsort(array, n);
		        System.out.println("");
		        System.out.println("array after the radix sort apply is ");
		        rr.print(array, n);
		    }}
