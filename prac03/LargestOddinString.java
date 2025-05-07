package com.prac03;

public class LargestOddinString {

	public static void main(String[] args) {

       String s="34567";
       
		System.out.println(odd(s));
	}
		public static String odd(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c   % 2 != 0) { // Check if it's an odd digit
                return s.substring(0, i+1); // Return the substring up to the odd digit
            }
        }
        return ""; // If no odd digit is found, return an empty string
    }
	}


