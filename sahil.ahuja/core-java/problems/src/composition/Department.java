package composition;

import java.util.Scanner;

public class Department {
	String deptname;
	Person ps;
	public String getDeptName() {
		return deptname;
	}
	public Department(String deptname){
		this.deptname=deptname;
		System.out.println("How many person u want to add in "+ deptname+" department");
		Scanner sc=new Scanner(System.in);
		int numberofperson=sc.nextInt();
		for(int i=1;i<=numberofperson;i++){
			System.out.println("Enter the "+i+" person name and person age");
			String personname=sc.next();
			int personage=sc.nextInt();
			ps=new Person(personname,personage);
		}
		
	}
	
	

}
