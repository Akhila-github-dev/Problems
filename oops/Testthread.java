package com.oops;

public class Testthread {

	public static void main(String[] args) {

		Mythread m=new Mythread("Thread1");
		Mythread m2=new Mythread("Thread2");
		m.start();
		m2.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("Mythread" +i);
		
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println("caught");
		}
		
	}

}
}