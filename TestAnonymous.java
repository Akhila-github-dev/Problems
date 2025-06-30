package com.emp;

public class TestAnonymous {
	
	public static void main(String[] args) {
		Anonymousclass a = new Anonymousclass() {

			@Override
			public void method1() {
			System.out.println("hi");
			System.out.println("Hello");
				
			}
			
		};
		
		
		a.method1();
	}

}


