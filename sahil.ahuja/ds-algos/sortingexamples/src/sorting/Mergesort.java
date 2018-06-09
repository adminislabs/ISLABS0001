package sorting;

public class Mergesort {

	
		static void mergesort(int[] arr,int min,int max)
		{
			if(min<max){
			int mid=(min+max)/2;
		mergesort(arr,0,mid);
		mergesort(arr,mid+1,arr.length-1);
		merge(arr,min,mid,max);
		}}
		static void merge(int[] arr,int min,int mid,int max)
		{
			int[] left=new int[mid+1-min];
			int[] right=new int[max-mid];
			for(int i=0;i<left.length;i++)
				left[i]=arr[min+i];
			for(int i=0;i<right.length;i++)
				right[i]=arr[mid+1+i];
			int leftpointer=0;
			int rightpointer=0;
			int arrnewpointer=min;
			while(leftpointer<left.length&&rightpointer<right.length)
			{
			if(left[leftpointer]<right[rightpointer])
			{
				arr[arrnewpointer]=left[leftpointer];
				arrnewpointer++;
				leftpointer++;
			}
			else
			{
				arr[arrnewpointer]=right[rightpointer];
				arrnewpointer++;
				rightpointer++;
			}
			}
			while(leftpointer<left.length)
			{
				arr[arrnewpointer]=left[leftpointer];
				arrnewpointer++;
				leftpointer++;
			}
			while(rightpointer<right.length)
			{
				arr[arrnewpointer]=right[rightpointer];
				arrnewpointer++;
				rightpointer++;
			}
		}
		public static void main(String[] args) {
			int[] arr=new int[]{2,3,8,5,6,1,7,4};
			int k=arr.length;
			mergesort(arr,0,k-1);
			for(int i=0;i<k;i++)
				System.out.println(arr[i]);
		}

}