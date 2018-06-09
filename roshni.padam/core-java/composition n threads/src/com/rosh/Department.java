package com.rosh;

public class Department {
	private int deptid;
	private Job j;
	public Person p;
	public Department() {
		this.p=new Person();
		p.setName("rosh");
		this.p=new Person();
		p.setHeight(5);
		this.p=new Person();
		p.setWeight(50);
		this.j=new Job();
		j.setSalary(400);
		this.j=new Job();
		j.setId(29);
	
	}
	
	
	/**
	 * @return the deptid
	 */
	public int getDeptid() {
		return deptid;
	}


	/**
	 * @param deptid the deptid to set
	 */
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}


	/**
	 * @return the j
	 */
	public Job getJ() {
		return j;
	}


	/**
	 * @param j the j to set
	 */
	public void setJ(Job j) {
		this.j = j;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
