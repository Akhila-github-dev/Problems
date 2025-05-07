package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
	
	
	
	List<Integer> l=List.of(0,1,2,3,4,3,5,1);
	
	Integer in=l.stream().map(f->f*f).reduce(0, (a,b)->a+b);
	System.out.println(in);
	
	l.stream().filter(f->f%2==0).forEach(System.out::println);
		//reduce(0,(a,b)->a+b);

	
	l.stream().distinct().forEach(System.out::println);
	
   System.out.println("*****************************************************");
   
     int arr[]= {1,3,3,4,5,8,8};
     
	 Arrays.stream(arr).distinct().forEach(System.out::println);
	 
	 
	 
	List<Integer> l1=List.of(1,3,3,4,5,8,8);
	
	 Set<Integer> s=new HashSet<>();
	 
	 for(int value:l1) {
		 s.add(value);
	 }
	 System.out.println(s);
	
	
	
	System.out.println("*****************************************************");
	
	

	
	   Map<Boolean, List<Integer>> map=l1.stream().collect(Collectors.partitioningBy(i->i%2==0));
	   
	   for(Entry<Boolean, List<Integer>> e:map.entrySet()) {
		   if(e.getKey()) {
			   System.out.println(e.getValue());
		   }else {
				   System.out.println(e.getValue());
			   }
			   
		   }
	   }
			   
		   
} 
		   
	   

	
	


