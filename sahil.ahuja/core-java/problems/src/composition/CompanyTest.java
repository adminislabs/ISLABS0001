package composition;

import java.util.Scanner;

public class CompanyTest {

	public static void main(String[] args) {
		while(true){
		System.out.println("Enter ur choice");
		System.out.println("1.Add a company");
		System.out.println("2.View the company");
		System.out.println("3.exit");
		Scanner sc=new Scanner(System.in);
		int choice =sc.nextInt();
		switch(choice){
		case 1:
		System.out.println("WARNING: U CAN ADD ONLY  ONE COMPANY, I WILL UPDATE THIS LATER");
		System.out.println("Enter Company's name");
		String companyName=sc.next();
		Company c=new Company(companyName);
		break;
		case 2:
			System.out.println("");
		}
		}
	}

}
