package com.prac03;

public class TwoStringDulplicates {

	public static void main(String[] args) {

		String s="abc";
		String s1="accbbc";
		
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s1.length();j++) {
				if(s.charAt(i)==s1.charAt(j)) {
					count++;
				}
			}
			System.out.println(s.charAt(i)+" "+count);
		}
	

	}

}
