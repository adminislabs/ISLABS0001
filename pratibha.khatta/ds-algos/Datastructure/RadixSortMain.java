package com.gndu.pratibha.helloworld;
/**
 * 
 * This class contains the implementation of the radix sort 
 * @author HP
 *
 */
public class RadixSortMain 
{
	// This  function gives maximum value in array[]
	    public int getMax(int array[])
	    {
	        int max = array[0];
	        for (int i = 1; i < array.length; i++){
	            if (array[i] > max)
	                max = array[i];
	        }
	        return max;
	    }
	     
	    // Main Radix Sort sort function
	    public void radixSort(int array[])
	    {
	        int digitPlace = 1;
	        int n=array.length;
	        int result[]=new int[n]; // resulting array
	        // Find the largest number to know number of digits
	        int largestNum = getMax(array);
	     
	     
	        //we run loop until we reach the largest digit place
	        while(largestNum/digitPlace >0){
	             
	            int count[]=new int[10];
	            //Initializing counting array C[] to 0
	            for (int i=0; i <10; i++)
	                count[i] = 0;
	                 
	             //Store the count of "keys" or digits in count[]
	            for (int i = 0; i < 10; i++)
	                count[ (array[i]/digitPlace)%10 ]++;
	     
	            // Change count[i] so that count[i] now contains actual
	            //  position of this digit in result[]
	            //  Working similar to the counting sort algorithm
	            for (int i = 1; i < 10; i++)
	                count[i] += count[i - 1];
	     
	            // Build the resulting array
	            for (int i = n - 1; i >= 0; i--)
	            {
	                result[count[ (array[i]/digitPlace)%10 ] - 1] = array[i];
	                count[ (array[i]/digitPlace)%10 ]--;
	            }
	     
	            // Now main array A[] contains sorted
	            // numbers according to current digit place
	            for (int i = 0; i < n; i++)
	                array[i] = result[i];
	     
	                // Move to next digit place
	                digitPlace *= 10;
	        }
	    }
	 
	}

