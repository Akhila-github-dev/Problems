package com.oops;

public class Inheritance {
	
	public void students() {
		System.out.println("makeNoise");
	}

     public void departments() {
    	 System.out.println("3");
     }
}
  class Child1 extends Inheritance{
	  
	  public void exams() {
			System.out.println("number");
		}

  }
	  class Child2 extends Inheritance{
		  
		  public void prinicipal() {
			  System.out.println("management");
		  }
	  }
	class Child3 extends Child2{
		
		public void staff() {
			System.out.println("helps");
		}
	}
  
  
  
