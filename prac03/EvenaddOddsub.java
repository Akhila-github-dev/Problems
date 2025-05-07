package com.prac03;

public class EvenaddOddsub {

	public static void main(String[] args) {
	
	   String str="123456";
		
		int sum=0;
		
		for(char c:str.toCharArray()) {
			int a=c-'0';
			if(a%2==0){
				sum+=a;
			}else {
				sum-=a;
			}
		}
		System.out.println(sum);
		}
	}


