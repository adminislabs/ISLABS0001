package com.datastructure.sorting;

public class InsertionSort {
	
	void insertionsort(int arr[]){
		
		for(int j=0;j<arr.length;j++){
			int key=arr[j];
			int i=j-1;
			while(i>=0&&arr[i]>key){
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		
		InsertionSort ss=new InsertionSort();
		int arr[]={3,5,1,4,7,2,9,6};
		int n=arr.length;
		System.out.println("the array after insertion sort:");
		ss.insertionsort(arr);
		for(int a:arr)
			System.out.println(a);
		
	}

}
