package com.prac01;

public class StringRotation {

	public static void main(String[] args) {
	
		
		String s="JavaJ2eeStrutsHibernate";
		String s1="StrutsHibernateJavaJ2ee";
		
	
		s=s+s;
		
		if(s.contains(s1)) {
			System.out.println(true);
		
		}else {
			System.out.println(false);
		}

	}


}