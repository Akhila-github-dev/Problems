package com.practice;

public class reverseofNumber {

	public static void main(String[] args) {
		
		
		int i=2345;
		int sum=0, r,rev = 0;
		
		while(i>0) {
			r=i%10;
			rev=rev*10+r;  
			i/=10;
		}
		System.out.println(rev);

	}

}
