package com.prac01;

public class Swap {

	public static void main(String[] args) {

		
		String s="abc";
		String s1="def";
		
		s=s+s1; //abcdef
		s1=s.substring(0, s.length()-s1.length());
		System.out.println(s1);
		s=s.substring(s1.length());
		System.out.println(s);
	}

}
