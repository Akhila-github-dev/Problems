package polymopism;

class Parent {

	int num = 10;
	int p = 80;

	void printNum() {
		System.out.println("num of A");
	}

	void pmethod() {
		System.out.println("parent method");
	}
}

class Child extends Parent {
	int num = 20;
	int c = 90;

	void printNum() {
		System.out.println("num of B");
	}

	void cmethod() {
		System.out.println("child method");
	}
}

public class demo {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.printNum();
		System.out.println(parent.num);

		parent.pmethod();
		// parent.cmethod(); //we can't call child method with parent reference
		System.out.println(parent.p);
		//System.out.println(parent.c); not able to call child class member with parent reference
		System.out.println("=====================================================");
		Child child=new Child();
		System.out.println(child.c);
		System.out.println(child.p);
		child.pmethod();
		child.cmethod();
		child.printNum();
		System.out.println(child.num);

	}
}