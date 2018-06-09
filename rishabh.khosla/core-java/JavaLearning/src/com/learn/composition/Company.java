package com.learn.composition;

public class Company {
	String companyname;
	int branchesnumber;
	Department dept;
	Person person;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getBranchesnumber() {
		return branchesnumber;
	}
	public void setBranchesnumber(int branchesnumber) {
		this.branchesnumber = branchesnumber;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	public Company(){
		this.companyname="hashmap";
		this.branchesnumber=1;
		
		
	}
	
	

}
