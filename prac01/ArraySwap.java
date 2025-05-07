package com.prac01;

import java.util.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
		
		
		int arr[]= {3,5,6,8,9,1};
		
		int i=0,j=arr.length-1,temp;
		
       while(i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
