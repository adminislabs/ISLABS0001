package sorting;

public class Bubblesort {
	public static void main(String[] args)
	{
		int[] arr=new int[]{2,3,7,5,6,8,9,1};
		int k=arr.length;
		for(int i=k;i>0;i--)
		{
			for(int j=0;j<k-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		k=k-1;}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
