package com.practice;


public class SecondSmallest {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 0};
	
		int n=arr.length;
		
		
		int small=Integer.MAX_VALUE;
		int sec_small=Integer.MAX_VALUE;
		int third_small=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<small) {  
				third_small=sec_small;//1<2L
				sec_small=small; //2L
				small=arr[i];    //1
			}
			else if(arr[i]<sec_small&& arr[i]!=small) {
				third_small=sec_small;
				sec_small=arr[i];
			}
			else if(arr[i]<third_small&&arr[i]!=sec_small) {
				third_small=arr[i];
			}
			
		}
		
		System.out.println(sec_small);
		System.out.println(third_small);
		
		
		
		
		//********************************************************************************
		
		

		
		
		int large=Integer.MIN_VALUE;
		int sec_large=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>large) {  //1<2L
				sec_large=large; //2L
				large=arr[i];    //1
			}
			else if(arr[i]>sec_large&& arr[i]!=large) {
				sec_large=arr[i];
			}
			
		}
		
		System.out.println(sec_large);	
	}

}
