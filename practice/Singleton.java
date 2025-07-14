 package com.practice;

public class Singleton {

	private static Singleton sing; //This is the only instance of the class that will exist.
	
    private Singleton() {// private constructor prevents external instantiation
    	
  }
	//Provide a public static method to get the instance
    public static Singleton getObjeSingleton() {//This method returns the instance, creating it only if it doesn't already exist.
    	
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
