package com.radixsort;
import java.util.Scanner;
/**
 * this class is implemented to check the working or test 
 * of our sorting code
 * @author rishab
 *
 */
public class TestRadixSort {

	public static void main(String[] args) {
		        RadixSortExample sort=new RadixSortExample();
		        Scanner scanner=new Scanner(System.in);
		        System.out.println("radix sort example");
		        System.out.println("enter the number of elements");
		        int n=scanner.nextInt();
		        int arr[]=new int[n];
		        System.out.println("no of elemnts inserted"+ " "+ n);
		        System.out.println("please enter the elemnts");
		        for(int i=0;i<n;i++) {
		        	arr[i]=scanner.nextInt();
		        }
		        System.out.println("elements are inserted");
		        sort.radixsort(arr, n);
		        System.out.println("elements after sorting are:");
		        sort.print(arr, n);
}
}