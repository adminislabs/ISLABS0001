package com.datastructure.sorting;

public class BubbleSort {
	
	void bubblesort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]>arr[j]){
					//swap
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
			}
		}	
	}

	public static void main(String[] args) {
		BubbleSort bs=new BubbleSort();
		int roshi[]={3,1,6,4,8,2};
		bs.bubblesort(roshi);
		System.out.println("bubble sort of the array roshni is");
		for(int k=0;k<=6;k++){
			System.out.println(roshi[k]);
			
		}
		
		
		

	}

}
