package com.practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateIntegers {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,2,3,4};
         
         HashMap<Integer, Integer> hash=new HashMap<>();
         
         
         for(int i:arr) {
         	if(!hash.containsKey(i)) {
         		hash.put(i, 1);
         	}
         	else {
         		
         		hash.put(i, hash.get(i)+1);
         	}
         }
        for(Map.Entry<Integer, Integer>m:hash.entrySet()) {
        
     	   System.out.println(m.getKey()+" "+m.getValue());
        }
	}

}
