package com.prac03;

public class CheckArraySorted {

	
	public static void main(String[] args) {
		
	
	int	array[] = {1,2,3,4,5};
	for(int i=1;i<array.length;i++) {
		if(array[i-1]>array[i]) {
			
			System.out.println("not sorted");
			return;
		}
	}
	System.out.println("sorted");
	}
}
