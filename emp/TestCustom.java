package com.emp;

public class TestCustom {

	public static void main(String[] args) throws Customexception {
         int age=16;
         
         if(age<18) {
        	 throw new Customexception("invalid age");
         }else {
        	 System.out.println("valid");
         }
	}

}
