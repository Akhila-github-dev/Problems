package com.prac03;

public class LongestSubString {

	public static void main(String[] args) {
	
		        String input = "javaconceptoftheday";
		        System.out.println("Longest substring without repeating characters: " + findLongestSubstring(input));
		    }

		    public static String findLongestSubstring(String input) {
		        String longest = "";
		        String current = "";

		        for (char c : input.toCharArray()) {
		            if (current.contains(String.valueOf(c))) {
		                current = current.substring(current.indexOf(c) + 1);
		            }
		            current += c;
		            if (current.length() > longest.length()) {
		                longest = current;
		            }
		        }
		        return longest;
		    }
}



