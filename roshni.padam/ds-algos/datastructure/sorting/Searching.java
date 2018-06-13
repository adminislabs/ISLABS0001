package com.datastructure.sorting;

public class Searching {
	
	int  BinarySearch(int arr[],int item){
		int low=arr[0];
		int high=arr.length;
		if(low<high){
			int mid=low+(high-low)/2;
			if(arr[mid]==item){
				return mid;
			}
			else if(item>arr[mid]){
				low=mid+1;
				high=arr.length;
				return BinarySearch(arr, item);
				
			}
			else if(item<arr[mid]){
				low=arr[0];
				high=mid-1;
				return BinarySearch(arr,item);
			}
			{
				
			}
			
			
		}
		return -(low+1);
		
		
	}
	
	

	public static void main(String[] args) {
		
		int arr[]={2,4,6,8,9};
		Searching s=new Searching();
		int pos=s.BinarySearch(arr,9);
		System.out.println(pos);	
		
		
		
		
		
	}

}
