
public class HollowMirroredRhombus 
{
	
		public static void main(String args[])
		{
		 
		
		   for (int i=1;i<=5;i++)
		   {
			   if(i==1||i==5)
			   {	
			       for(int k=1;k<=5;k++)
			       { 
			    	  System.out.print("*");	
			       }	
			       System.out.println("\n");
			    }
			       
			   else
			   {
				   
				   for(int k=1;k<=5;k++)
				   {
					   if(k==1||k==5)
					   {
						   System.out.print("*");
					   }
					   else
					   {
						   System.out.print(" ");
					   }
				   }
				   System.out.println("\n");
			   }
		   	   
	            
		   }
		
	  }
	}

