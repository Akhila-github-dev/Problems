package com.prac03;

import java.util.Arrays;

public class Interv {

	public static void main(String[] args) {
		
		
        int arr[]= {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1];
			arr[arr.length-1]=temp;
	        break;
			}
			}
		
		System.out.println(Arrays.toString(arr));

	}

}
