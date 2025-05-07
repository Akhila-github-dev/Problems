package com.prac04;

public class Sortcharbyfrequency {

	public static void main(String[] args) {
		
		String str="raaaajj";
		int hash[]=new int[26];
		for(int i=0;i<str.length();i++) {
			hash[str.charAt(i)-'a']++;
		}
		for(int i=0;i<hash.length;i++) {
			if(hash[i]>=1) {
				System.out.println((char)(i+'a')+" "+hash[i]);
			}
		}
	}
	}


