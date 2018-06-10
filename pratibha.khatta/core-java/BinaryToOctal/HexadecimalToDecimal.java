package BinaryToOctal;

public class HexadecimalToDecimal 
{
	static int hexatoDecimal(String hexanum)
	{
		int length=hexanum.length();
		 int base = 1;
	        int dec_val = 0;
	        for (int i=length-1; i>=0; i--)
	        {   
	            if (hexanum.charAt(i) >= '0' && hexanum.charAt(i) <= '9')
	            {
	                dec_val += (hexanum.charAt(i) - 48)*base;
	                   base = base * 16;
	            }
	  
	            
	            else if (hexanum.charAt(i) >= 'A' && hexanum.charAt(i) <= 'F')
	            {
	                dec_val += (hexanum.charAt(i) - 55)*base;
	                base = base*16;
	            }
	        }
	        return dec_val;
	    }
	
   public static void main(String args[])
   {
	   String hexanum="1A";
	   System.out.println(hexatoDecimal(hexanum));
   }
}
