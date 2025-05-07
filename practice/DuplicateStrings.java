package com.practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStrings {

	public static void main(String[] args) {

		String s = "fizzbuzz";

		HashMap<Character, Integer> hash = new HashMap<>();

		for (char str : s.toCharArray()) {
			if (!hash.containsKey(str)) {
				hash.put(str, 1);
			} else {
				hash.put(str, hash.get(str) + 1);
			}
		}
		Integer max = 0;
		for (Map.Entry<Character, Integer> m : hash.entrySet()) {

			// System.out.println(m.getKey()+ " = "+m.getValue());

			if (m.getValue() > max) {
				max = m.getValue();

			}
		}
		System.out.println(max);

		// ****************************************************************************

//        String str="ABCDEA";
//		
//		int hash1[]=new int[26];
//		
//		for(int i=0;i<str.length();i++) {
//			hash1[str.charAt(i)-'A']++;
//		
//		}
//		
//		for(int i=0;i<hash1.length;i++) {
//			if(hash1[i]>0){
//				System.out.println((char)(i+'A')+" "+hash1[i]);
//			}
//		}
//		

	}

}
