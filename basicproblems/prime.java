package basicproblems;

public class prime {
	public static void main(String[] args) {
		int n = 36, c = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (n % i == 0) {
				c++;
				break;
			}
		}

		if (c == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}
}
