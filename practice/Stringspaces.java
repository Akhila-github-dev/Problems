package com.practice;

import java.util.Arrays;

public class Stringspaces {
	
	public static void main(String[] args) {
		

		String s = "where is the cat";
		
       //System.out.println(s.replaceAll(" ", ""));
       
       String str[]=s.split(" ");
       
     //System.out.println(Arrays.toString(str));
       
       String st = "";
       
       for(String m:str) {
    	  st+=m; //where 
      }
		System.out.println(st);
		
		
	}
	

}
