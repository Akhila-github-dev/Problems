package com.prac01;

import java.util.HashMap;
import java.util.Map.Entry;

public class firstRepeatedChar {
	
	public static void main(String[] args) {
		
		String s="abbccda";
		
		HashMap<Character, Integer> hash=new HashMap<>();
		
		for(char c:s.toCharArray()){
			if(!hash.containsKey(c)) {
			hash.put(c, 1);
		}else {
			hash.put(c, hash.get(c)+1);
		}
		}	
			for(Entry<Character, Integer> e:hash.entrySet()) {
		    if(e.getValue()>1) {  // if(e.getValue()==1) for non repeated char
			System.out.println(e.getKey() +" "+e.getValue());
			break;
				} 
			}
			
	}

}
