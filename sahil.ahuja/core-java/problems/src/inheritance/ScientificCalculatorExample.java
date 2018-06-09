package inheritance;

import java.util.Scanner;

public class ScientificCalculatorExample {

	public static void main(String[] args) {
		ScientificCalculator sf=new ScientificCalculator();
		while(true){
		System.out.println("Enter ur choice");
		System.out.println("1.Want to add numbers");
		System.out.println("2.Want to subtract numbers");
		System.out.println("3.Want to multiply numbers");
		System.out.println("4.Want to divide numbers");
		System.out.println("5.Exit");
		Scanner sc = new Scanner(System.in);
		int  choice=sc.nextInt();
		
		switch(choice){
		case 1:
			int sum1;
			System.out.println("How many numbers u want to add");
			int k=sc.nextInt();
			System.out.println("Enter the numbers");
			if(k==2){
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				 sum1=sf.sum(n1, n2);
						
			}
			else{
			int[] num=new int[k];
			for(int i=0;i<k;i++){
				num[i]=sc.nextInt();
			}
			sum1=sf.sum(num);
			}
			System.out.println("Sum is="+sum1);
			break;
		case 2:
			int sub1;
			System.out.println("How many numbers u want to Subtract");
			int k2=sc.nextInt();
			System.out.println("Enter the numbers");
			if(k2==2){
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				 sub1=sf.sub(n1, n2);
						
			}
			else{
			int[] num=new int[k2];
			for(int i=0;i<k2;i++){
				num[i]=sc.nextInt();
			}
			sub1=sf.sub(num);
			}
			System.out.println("Result is="+sub1);
			break;
		case 3:
			int multi;
			System.out.println("How many numbers u want to multiply");
			int k3=sc.nextInt();
			System.out.println("Enter the numbers");
			if(k3==2){
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				 multi=sf.multiply(n1, n2);
						
			}
			else{
			int[] num=new int[k3];
			for(int i=0;i<k3;i++){
				num[i]=sc.nextInt();
			}
			multi=sf.multiply(num);
			}
			System.out.println("Result is="+multi);
			break;
		case 4:
			int div;
			System.out.println("How many numbers u want to divide");
			int k4=sc.nextInt();
			System.out.println("Enter the numbers");
			if(k4==2){
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				 div=sf.divide(n1, n2);
						
			}
			else{
			int[] num=new int[k4];
			for(int i=0;i<k4;i++){
				num[i]=sc.nextInt();
			}
			div=sf.divide(num);
			}
			System.out.println("Result is="+div);
			break;
		case 5:
			java.lang.System.exit(0);
		}

	}

}
}