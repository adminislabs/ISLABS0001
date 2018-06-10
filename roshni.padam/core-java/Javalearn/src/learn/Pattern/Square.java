package learn.Pattern;

public class Square {

	public static void main(String[] args) {
		for (int i=0;i<=4;i++) {
			if(i==1|| i==4)
			{
			
			for (int k=0;k<=i-1;k++) {
				System.out.print(" ");
				
			}
			for (int j=0;j<=6;j++) {
	System.out.print("*");}
			}
			else
			{
				for(int k=1;k<-i-1;i++)
				{
					System.out.println(" ");
					
				}
				for (int j=1;j<=5;j++)
				{
				
				
				if ( j==1|| j==5) {
					System.out.println("*");
				}
				else
				{
					System.out.println(" ");
				}
					
				}
					
				
		
		System.out.println("\n");
		
	}}
	

	}
	}

