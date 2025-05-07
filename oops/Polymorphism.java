package com.oops;

public class Polymorphism {
	
	void Student() {
		System.out.println("class 5");
	}

}

class Child extends Polymorphism{
	@Override
	void Student() {
		System.out.println("class 6");
	}
}


