package com.oops;

public class Encapsulation {
	
	private String name;
	private int rollNo;
	private String dept;
	
	public Encapsulation(String name, int rollNo, String dept) {
		this.name=name;
		this.rollNo=rollNo;
		this.dept=dept;
		
	}
	
	public Encapsulation() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
