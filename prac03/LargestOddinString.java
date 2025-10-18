package com.prac03;

public class LargestOddinString {

	public static void main(String[] args) {

       String s="034567";
       
		System.out.println(odd(s));
	}
		public static String odd(String s) {
		int ind = -1;

		    for (int i = s.length() - 1; i >= 0; i--) {
		        if ((s.charAt(i) - '0') % 2 != 0) {
		            ind = i;
		            break;
		        }
		    }

		    if (ind == -1) {
		        return "";
		    }

		    return s.substring(0, ind + 1).replaceFirst("^0+", "");
		}
	}



