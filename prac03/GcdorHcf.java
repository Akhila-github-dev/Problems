package com.prac03;

public class GcdorHcf {

	public static void main(String[] args) {
		
		
		int n1 = 24, n2 = 12, gcd = 0,LCM=0;
		for (int i = 2; i <= Math.min(n1, n2); i++) {
			
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
			}		
		LCM=(n1*n2)/gcd;

		System.out.println(gcd);

		System.out.println(LCM);
		}
		
		}
	


