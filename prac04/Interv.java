package com.prac04;

public class Interv {

	public static void main(String[] args) {
	
		
		String[] s= {"abc","def","ghi"};
		
		
		String res="";
	
		for(int i=0;i<s.length;i++) {
			  for(int j=0;j<s.length;j++) {
				  char sr=s[j].charAt(i);
				  res=res+sr;
			  }
		}
          System.out.println(res);
	}

}
