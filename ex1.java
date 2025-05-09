package StringsPractice;

public class ex1 {

	public static void main(String[] args) {
		//equals method in string compares the content 
		String s=new String("hello");
		String s1=new String("hello");
		if(s.equals(s1)) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		
		String s2="hello";
		System.out.println(s.equals(s2));
	}
}
