package com.practice;

public class Pattern {

	public static void main(String[] args) {

//		
//		* * *       
//		* * *
//		* * *
		//============================================================
		
		
	int n= 5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^6	
		int m=5;
		for(int i=1;i<=m;i++) {
			for(int j=m;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	//	********************************************************
		
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		//***
		
	// ****************************************************
		
		
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		
		
		
		int k = 3;

		for (int i = 0; i < k; i++) {
			for (int j = 0; j <= k-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//*************************************************
		
		
		//pyramid down
		
		int p = 5;

		for (int i = 0; i < p; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*p)-(2*i+1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		* 
//		* * 
//		* * *
		
		
//		* * * * * *
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		*
		
		

