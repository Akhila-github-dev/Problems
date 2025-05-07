package com.oops;

public abstract class Abstraction {
	
	abstract void makeSound();
	
	
	public void Sleep() {
		System.out.println("zzzzzzzzzzzz");
	}
	
}
	class Dog extends Abstraction{

		@Override
		void makeSound() {
			System.out.println("bowww");
			
		}

}
