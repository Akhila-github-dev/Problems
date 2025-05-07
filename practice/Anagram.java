package com.practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1="Mary";
		String s2="Army";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()==s2.length()) {
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean result=Arrays.equals(c1, c2);
		
			System.out.println(result);
		}else {
			System.out.println("not");
		}
		
	}

}
