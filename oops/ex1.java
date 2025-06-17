package exception;

class myException1 extends Exception{}

class myException2 extends Exception{}


public class ex1 {

	public static void method1() throws Exception{
		try {
			System.out.println("1");
			throw new myException1();
		}catch(Exception e) {
			System.out.println("2");
			throw new myException2();
		}
	}
	
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("5");
			method1();
			System.out.println("10");
		}catch (Exception e) {
			System.out.println("6");
			throw new myException2();
		}finally {
			System.out.println("7");
			throw new myException1();
		}
	}
	
}

output 
5
1
2
6
7
Exception in thread "main" com.myException1
	at Practice/com.ex1.main(ex1.java:29)

