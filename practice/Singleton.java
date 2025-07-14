 package com.practice;

public class Singleton {

	private static volatile Singleton singleton; //This is the only instance of the class that will exist.
	//volatile to prevent instruction reordering.
  	 private Singleton() {// private constructor prevents external instantiation
    	
  }
	//Provide a public static method to get the instance
   	 public static Singleton getObjeSingleton() {//This method returns the instance, creating it only if it doesn't already exist.
    		if(singleton==null) {
    		 synchronized (Singleton.class) {
			  if(singleton==null) {
				singleton=new Singleton();	
				}
			}
    	}
    	return singleton;
    }

}
