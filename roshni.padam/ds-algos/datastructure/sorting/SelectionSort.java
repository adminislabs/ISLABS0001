package com.datastructure.sorting;

public class SelectionSort {
	void selectionsort(int arr[]){
		for(int i=0;i<=arr.length-1;i++){
			int minimum=i;
			for(int j=i+1;j<arr.length;j++)
				if(arr[j]<arr[minimum]){
					minimum=arr[j];
				}
				int temp=arr[j];
				arr[j]=arr[minimum];
				arr[minimum]=temp;
			
				}
	}
	

	public static void main(String[] args) {

		SelectionSort ss=new SelectionSort();
		int roshni[]={3,5,8,2,9,1};
		ss.selectionsort(roshni);
		System.out.println("the array after selection sort sorting is:");
		for(int r:roshni){
			System.out.print(r);
		}
		
		

	}
}
