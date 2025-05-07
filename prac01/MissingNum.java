package com.prac01;

public class MissingNum {

	public static void main(String[] args) {
		 
		
		int arr[]= {1, 4,  3};
		
		int s=0,n=arr.length+1;
		
		n=n*(n+1)/2; //sum of natural numbers 4*2.5
	
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		
	
		System.out.println(n-s);

	}

}
