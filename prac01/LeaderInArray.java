   package com.prac01;

public class LeaderInArray {

	
	public static void main(String[] args) {

	    int arr[]=	{14, 9, 11, 7, 8, 5, 3} ;
	    
	    
	    for(int i=0;i<arr.length;i++) {
	    	boolean flag=true;
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i]<arr[j]) {
	    			flag=false;  
	    			break;
	    		}
	    	
	    	}
	    	if(flag) {
	    		System.out.println(arr[i]);
	    	}
	    }
		
	}
}


