package com.oops;

public class TestEncap {

	
	public static void main(String[] args) {
		Encapsulation en=new Encapsulation();
		en.setName("Bhanu");
		en.setRollNo(3);
		en.setDept("Agriculture");
		System.out.println(en.getName());
		System.out.println(en.getRollNo());
		System.out.println(en.getDept());
	}
}
