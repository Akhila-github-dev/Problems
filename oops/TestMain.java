package Interface;

public class TestMain implements a,b {
	


	public static void main(String[] args) {
		TestMain t=new TestMain();
		t.method();
	}

	@Override
	public void method() {
		System.out.println("child class ");
		a.super.method();
	}

}

interface a{
	
	default void method() {
		System.out.println("interface a");
	}
}

interface b{
	
	default void method() {
		System.out.println("interface b");
	}
}
