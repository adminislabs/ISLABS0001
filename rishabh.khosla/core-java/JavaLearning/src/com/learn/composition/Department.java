package com.learn.composition;

public class Department {
	String deptname;
	int deptStrength;
	private Job job;
	private Person person;
	public Department(){
		this.person=new Person();
		person.setName("rishab");
		person.setHeight(6);
		person.setWeight(70);
		this.deptname="techincal";
		this.deptStrength=50;
		this.job=new Job();
		job.setId(12);
		job.setSalary(5000);
			
	}
	
	public int getid(){
		return job.getId();
	
	}
	public int getSalary(){
		return job.getSalary();
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getDeptStrength() {
		return deptStrength;
	}
	public void setDeptStrength(int deptStrength) {
		this.deptStrength = deptStrength;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public String getPerson() {
		return person.getName();
		
	}
	
	public int getPersonHeight(){
		return person.getHeight();
		
	}
	public int getPersonWeight(){
		return person.getWeight();
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	

}
