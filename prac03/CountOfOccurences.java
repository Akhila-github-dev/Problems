package com.prac03;

public class CountOfOccurences {

	public static void main(String[] args) {


		 int max=0;
		 int c=0;
		    
		    
		    int arr[] = {10,5,10,15,10,5};
		   
			
			int hash[]=new int[16];
			
			for(int i=0;i<arr.length;i++) {
				hash[arr[i]]++;
			}
			for(int i=0;i<hash.length;i++) {
				if(hash[i]>=1) {
					//System.out.println(i+" "+hash[i]);
				}
			
			
			if(hash[i]>max) {
				max=hash[i];
				c=i;
			}

			}
			
			System.out.println(max+" "+c);
			
	}

}

