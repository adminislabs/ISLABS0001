package BinaryToOctal;
public class DecimalToBinary
{
		public void binary(int number)
		{
			int array[]=new int[30];
			int index=0;
			while(number > 0)
			{
		
				array[index++]=number%2;
				number=number/2;
				
			}
			for(int i=index-1;i>=0;i--)
			
				System.out.println(array[i]);
			
		}
		public static void main(String args[])
		{
			DecimalToBinary object =new DecimalToBinary();
			System.out.println("binary representtion of 26");
			object.binary(26);
		}

	}