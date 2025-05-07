package com.prac01;

public class binary {

	public static void main(String[] args) {

		int x = 10101;

		System.out.println(BinaryOrNot(x));
	}

	private static String BinaryOrNot(int x) {
		int l = 0;
		while (x > 0) {
			l = x % 10;
              if (l > 1) {
                 return "not Binary";
			} else {
				x = x / 10;
			}
		}
		return "binary";
	}

}
