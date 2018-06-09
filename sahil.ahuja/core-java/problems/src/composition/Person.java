package composition;

import java.util.Scanner;

public class Person {
	String personname;
	int personage;
	Job jb;
	public Person(String personname,int personage){
		this.personname=personname;
		this.personage=personage;
		System.out.println("Enter the role and salary u want to give to "+personname);
		Scanner sc=new Scanner(System.in);
		String jobname=sc.next();
		int salary=sc.nextInt();
		jb=new Job(jobname,salary);
		return;
	}
	public String getPersonname() {
		return personname;
	}

	public int getPersonage() {
		return personage;
	}
	
	
    
	

}
