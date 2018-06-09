package Datastructure;

public class SelectionSort
{
	public static void main(String args[])
	int arr[]={80,40,85,20,10};

}

public void sort(int arr[])
{
	int lowestelement;
	for(int loop=0;loop<arr.length;loop++)
	{
		lowestelement=loop;
		for(int innerloop=loop+1;innerloop<arr.length;innerloop++)
		{
			if(arr[innerloop]<arr[loop])
			{
				lowestelement=innerloop;
			}
		}
		int temp=arr[innerloop];
		arr[innerloop]=arr[loop];
		arr[loop]=temp;
	}
}
