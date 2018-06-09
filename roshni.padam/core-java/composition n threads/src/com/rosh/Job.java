package com.rosh;

public class Job {
	private int Salary;
	private int id;
	private String location;
	private  Person p; {
	this.p=new Person();
	p.setName("rosh");
	this.p=new Person();
	p.setHeight(5);
	this.p=new Person();
	p.setWeight(50);
	}
	
	

	
	public int getSalary() {
		return Salary;
	}


	
	public void setSalary(int salary) {
		Salary = salary;
	}


	
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
