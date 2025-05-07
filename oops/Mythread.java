package com.oops;

public class Mythread extends Thread{
	
	private String threadCount;
	
	public Mythread(String threadCount) {
		this.threadCount=threadCount;
	}
     @Override
	public void run() {
		
	   for(int i=0;i<=5;i++) {
		System.out.println(threadCount+ " "+i);
	   
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println(threadCount + " "+"interrupted");
		}
		
		
	   }
		
	
}
	
}
