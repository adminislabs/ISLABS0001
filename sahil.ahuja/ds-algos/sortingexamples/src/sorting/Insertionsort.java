package sorting;

public class Insertionsort {

	public static void main(String[] args) {
		int[] arr=new int[]{2,5,4,1,3,8,7,6};
		int k=arr.length;
		for(int i=1;i<k;i++)
		{
			int value=arr[i];
			int hole=i;
			while(hole>0&&arr[hole-1]>value)
			{
				arr[hole]=arr[hole-1];
				hole=hole-1;
			}
			arr[hole]=value;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
