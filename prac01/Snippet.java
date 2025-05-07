package com.prac01;

import java.util.Arrays;

public class Snippet {
	public static void main(String[] args) {
		
	
	int arr[]= {14, 0, 5, 2, 0, 3, 0};
			int j=arr.length-1; //7
			for(int i=arr.length-1;i>=0;i--) {
				if(arr[i]!=0) {
					arr[j]=arr[i];
					j--;
				}
			}
			while(j>=0) {
				arr[j]=0;
				j--;
			}
			System.out.println(Arrays.toString(arr));
		
	//==============================================================================
			
	    int ar[]= {14, 0, 5, 2, 0, 3, 0};
	
		int g=0;
		
		for(int h=0;h<ar.length;h++) {
			if(ar[h]!=0) {
				ar[g]=ar[h];
				g++;
			}   // arr[g]={14,5,2,3}
			
		}
		
		while(g<ar.length) { //4
			ar[g]=0;
			g++;
		}
			System.out.println(Arrays.toString(ar));
			
			
			
			
			
			
	//*****************************************************************************		
			
		

	String s="Ab3cDre@5Ud$f";
	       
	        int n=0,u=0,d=0, y=0;
	        for(char c:s.toCharArray()) {
	   
	       if(Character.isUpperCase(c)) {
	    	   u++;
	       }
	       else if(Character.isLowerCase(c)) {
	    	   n++;
	       }
	       else if(Character.isDigit(c)) {
	    	   d++;
	       }
	       else if(!Character.isAlphabetic(c))
	         y++;
	        }
	   System.out.println(u);
	   System.out.println(n);
	   System.out.println(d);
	   System.out.println(y);
}
}

