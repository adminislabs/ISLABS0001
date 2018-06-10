package learn.algowriting;



public class Decimal2Binary {

	void convert(int n){
		int arr[]=new int[50];
		int s=0;
		while(n>0){
			
			n=n/2;
			if(n%2==1){
				arr[s]=1;
				s++;
			}
			arr[s]=0;
			s++;
		}	

		for(int i=s-1;i>=0;i--)
		System.out.print(arr[s]);
		
	}
	
	public static void main(String[] args) {
		Decimal2Binary c=new Decimal2Binary();
		
		c.convert(13);
		
}}
