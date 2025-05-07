package com.prac01;

public class Removevowel {

	public static void main(String[] args) {

		
		String s="akhila";
		
       		
		String e="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
		    if(c!='a'&& c!='e'&& c!='i'&& c!='o'&& c!='u') {
		    	e+=c;
		    	
		}
		}
		System.out.println(e);

	}

}
