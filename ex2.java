package StringsPractice;

public class ex2 {

	public static void main(String[] args) {
		//Object’s class equals()	 method is getting used and as it compares the reference of two objects
		StringBuilder s=new StringBuilder("hello");
		StringBuilder s1=new StringBuilder("hello");
		if(s.equals(s1)) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		
	}

}
