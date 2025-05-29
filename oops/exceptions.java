package exception;

public class exceptions {

	public static void m1() {
		m2();
	}
	public static void m2() {
		throw new ArithmeticException("method2 exc");
	}
	
	public static void main(String[] args) {
		try {
			m1();
		}catch(ArithmeticException ex) {
			System.out.println("main method exception handled");
		}
	}
//main method exception handled
}
