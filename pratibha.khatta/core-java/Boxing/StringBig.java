package Boxing;
import java.math.BigDecimal;
public class StringBig 
{
	public static void main(String args[])
	{
		String Test="97.89";
		BigDecimal bigDecimalTest=new BigDecimal(Test);
		System.out.println("Converting String into BigDecimal="+bigDecimalTest);
	}

}
