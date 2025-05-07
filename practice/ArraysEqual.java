package com.practice;

public class ArraysEqual {
	
	public static void main(String[] args) {
		
	
	int arr[]= {1,2,3,4,5};
	int brr[]= {1,2,4,5,7};
	
   System.out.println(arrayEqual(arr, brr));
	
	}

private static String arrayEqual(int[] arr, int[] brr) {
	
	if(arr.length!=brr.length) {
		return "not equal";
	}else {
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=brr[i]) {
			
			return "not equal";
		}
	}
	return "both are same";
}
}


}
