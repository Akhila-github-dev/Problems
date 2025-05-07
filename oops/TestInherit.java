package com.oops;



public class TestInherit {

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.departments();
		c.students();
		c.exams();
		
		Child2 c2=new Child2();
		c2.departments();
		c2.students();
		c2.prinicipal();
		
		Child3 c3=new Child3();
		c3.departments();
		c3.students();
		c3.prinicipal();
		c3.staff();
		

	}

}
