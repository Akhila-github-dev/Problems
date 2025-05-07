        package com.prac01;

public class Numberornot {

	public static void main(String[] args) {
		String a="1a23";
		
		try {
			 Integer.parseInt(a);
		     
		 }catch(NumberFormatException ex) {
			 ex.printStackTrace();
		 }
	

//		    
//			for(int i=0;i<a.length();i++) {
//				if(!Character.isDigit(a.charAt(i))) {
//					System.out.println("not a number");
//				}else {
//					System.out.println("number");
//				}
//			}

	}

}
