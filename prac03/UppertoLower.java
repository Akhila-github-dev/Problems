package com.prac03;

public class UppertoLower {

	public static void main(String[] args) {

		String s = "NewYork";
		StringBuilder result = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c)) {
				result.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				result.append(Character.toUpperCase(c));

			}
		}

		System.out.println(result);
	}
}
