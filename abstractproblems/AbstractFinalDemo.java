package abstractproblems;


abstract class GrandParent {
	abstract void display();
}

abstract class Parent extends GrandParent {	// Can we remove the abstract keyword from here?
	final void displayInParent() {
		System.out.println("In Parent");
	}
}

class Child extends Parent {
	void display() {
		System.out.println("Child completes Parent and GrandParent");
	}
}

final class GrandChild extends Child {
	//void displayInParent() { }		// See what happens here
	
	void display() {
		System.out.println("In GrandChild");
		super.display();
	}
}

//class GreatGrandChild extends GrandChild { }		    // See what happens here


public class AbstractFinalDemo {
	public static void main(String[] args) {
		new GrandChild().display();
	}

}
