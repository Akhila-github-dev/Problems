package com.prac01;

import java.util.Arrays;

public class Stringrev {

	public static void main(String[] args) {
 
		
		String s = "java concepts of the day";

		String[] split = s.split(" ");

		String reverse = "";

		
		for (int i = 0; i <split.length; i++) {
			
			String word = split[i];
			String res = "";
		

			for (int j = 0; j < word.length(); j++) {
				res = word.charAt(j) + res;
			}
			reverse = reverse + res + " ";

		}
		System.out.println(reverse);

	}

}
