 package com.practice;

public class Singleton {

	private static Singleton sing;
	
    private Singleton() {
    	
  }
	
    public static Singleton getObjeSingleton() {
    	
    	if(sing==null) {
    		synchronized (Singleton.class) {
				if(sing==null) {
					sing=new Singleton();
					
				}
			}
    	}
    	
    	
    	
    	return sing;
    }

}
