package sorting;

public class Selectionsort {
	public static void main(String[] args)
	{
		int[] arr=new int[]{2,3,8,6,4,1,5,7};
		int k=arr.length;
		for(int i=0;i<k;i++)
		{
			int temp=arr[i];
			int index=i;
			for(int j=i;j<k;j++)
			{
				if(arr[j]<temp){
					temp=arr[j];
                    index=j;				
				}
			}
			arr[index]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
