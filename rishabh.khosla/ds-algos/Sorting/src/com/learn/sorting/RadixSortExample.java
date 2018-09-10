package com.radixsort;
import java.util.Arrays;
/**
 * 
 * create a radix sort example in the below code 
 * @author rishab
 *
 */
public class RadixSortExample { 
	    /**
	     * method created to find out the maximum element in the array
	     * @param arr
	     * @param n
	     * @return
	     */
	    static int getMax(int arr[], int n)
	    {
	        int max = arr[0];
	        for (int i = 1; i < n; i++)
	            if (arr[i] > max)
	                max = arr[i];
	        return max;
	    }
	 /**
	  * a method to sort the array according to the digit
	  *  exponential one by one of the position 
	  * @param arr
	  * @param n
	  * @param exp
	  */
	     static void countSort(int arr[], int n, int exp)
	    {
	        int output[] = new int[n]; 
	        int i;
	        int count[] = new int[10];
	        Arrays.fill(count,0);
	 
	       /**
	        * Store count of occurrences in count[]
	        */
	        
	        for (i = 0; i < n; i++)
	            count[ (arr[i]/exp)%10 ]++;
	 
	        for (i = 1; i < 10; i++)
	            count[i] += count[i - 1];
	  /**
	   * here build the output of the array
	   */
	        for (i = n - 1; i >= 0; i--)
	        {
	            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
	            count[ (arr[i]/exp)%10 ]--;
	        }
	        for (i = 0; i < n; i++)
	            arr[i] = output[i];
	    }
	    /**
	     * the main function to sort the array acc to the 
	     * radix implementation
	     * @param arr
	     * @param n
	     */
	    static void radixsort(int arr[], int n)
	    {
	        int m = getMax(arr, n);
	        for (int exp = 1; m/exp > 0; exp *= 10)
	            countSort(arr, n, exp);
	    }
	    /**
	     * function to print the output sorted array    
	     * @param arr
	     * @param n
	     */
	     void print(int arr[], int n)
	    {
	        for (int i=0; i<n; i++)
	            System.out.print(arr[i]+" ");
	    }
}
