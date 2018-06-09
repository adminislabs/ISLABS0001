public class ScientificCalculator extends BasicCalculator 
{
	public int sum(int...number)
	{
		int sum=0;
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
		}
		return sum;
	}
	public int multiply(int...number)
	{
		int mul=1;
		for(int i=0;i<number.length;i++)
		{
			mul=mul*number[i];
		}
		return mul;
	}
	
	public int divide(int...number)
	{
		int num=1;
	  int div=number[0];
		for(int i=1;i<number.length;i++)
		{
			num=div/number[i];
		}
		return num;
	}
}
