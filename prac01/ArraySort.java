package com.prac01;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		
		//Selectionsort
		
		int arr[] = { 3, 4, 5, 6, 9, 1 };

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {   //4<3
					min = j;  //  5 index 
				}
			}
		
			int temp = arr[min];  //1 
			arr[min] = arr[i];    //3
			arr[i] = temp;        //1

		}
		
		System.out.println(Arrays.toString(arr));
		
		
   //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
		
		
		//bubbleSort
		
		int a[] = { 3, 4, 5, 6, 9, 1};

		for(int i=a.length-1;i>=0;i--) {
			for(int j=0;j<=i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j]; //9 
					a[j]=a[j+1]; //1
					a[j+1]=temp; //9
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
