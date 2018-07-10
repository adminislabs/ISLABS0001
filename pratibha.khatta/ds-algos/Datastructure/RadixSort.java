package com.gndu.pratibha.helloworld;
/**
 * 
 * this class call calls the radixSort method from radixsortmain class and ask user to enter the number of elements 
 */
import java.util.Scanner;

	public class RadixSort
	{
	    public static void main(String[] args) {
			RadixSortMain radix = new RadixSortMain();
			Scanner scan = new Scanner(System.in);
			System.out.println("Radix Sort");
			int item;
			System.out.println("Enter number of integer elements");
			item = scan.nextInt();
			// array of n elements 
			int arr[] = new int[item];
			
			System.out.println("Enter " + item+ " integer elements");
			for (int i = 0; i < item; i++) {
				arr[i] = scan.nextInt();
			}
			radix.radixSort(arr);//calling method present in radixsortmain class
			
			System.out.println("Elements after sorting ");
			for (int i = 0; i < item; i++) {
				System.out.print(arr[i] + " ");
				scan.close();
			}
		}
	}

