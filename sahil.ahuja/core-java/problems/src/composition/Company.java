package composition;

import java.util.Scanner;

public class Company {
	String companyName;
	Department dp;
	public String getCompanyName() {
		return companyName;
	}
	public Company(String companyName){
		this.companyName=companyName;
		
		System.out.println("how many departments u want to add");
		Scanner sc=new Scanner(System.in);
		int numberofdepartments=sc.nextInt();
		for(int i=1;i<=numberofdepartments;i++){
            System.out.println("Enter the "+i+" department name");
            String deptname=sc.next();
			dp=new Department(deptname);
		}
	}
	
	


}
