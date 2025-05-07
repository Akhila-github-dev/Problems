package com.oops;

public class Exceptions {

	public static void main(String[] args) {
	
		
		try {
			int c=	6/0;
			}catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("ex");
			}catch(ArithmeticException ex) {
				System.out.println(ex);
			}
			catch (Exception e) {
				System.out.println("e");
			}

	}

}
