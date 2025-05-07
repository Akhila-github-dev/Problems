package com.prac04;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
	
	
	
	String str[] = { "flower", "flow", "flight" };

	Arrays.sort(str);
	String first = str[0];
	String last = str[str.length - 1];
	String res = "";
	for (int i = 0; i < str.length; i++) {
		if (first.charAt(i) == last.charAt(i)) {
			res += first.charAt(i);
		} else {
			break;
		}
	}
	System.out.println(res);
	
//	Another way
	
//	int ind=0;
//	while(ind<str.length) {
//		if(first.charAt(ind)==last.charAt(ind)) {
//			ind++;
//		}else {
//			break;
//		}
//	}
//	System.out.println(ind==0 ? "":first.substring(0,ind));
//
//}

}
}