package com.learn.composition;

public class Person {
	
	
	private int height;
	private int weight;
	private Job job;
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	Person(){
		this.job=new Job();
		job.setId(1);
		job.setLocation("pune");
		job.setSalary(500);
		job.setRole("team Leader");
		
		
	}
	
	
	}
	 
	
	
	
	


