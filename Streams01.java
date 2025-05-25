package com.emp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams01 {

	public static void main(String[] args) {


		List<Integer> s=Arrays.asList(30000,40000,500000,60000);
		
		List<Integer> collect = s.stream().filter(c->(c>40000)).collect(Collectors.toList());
		System.out.println(collect);
		
		//**************************************************************************************
		
		//sum of first 10 natural num
		
		int sum = IntStream.range(1, 11).sum();
		
		System.out.println(sum);
		
		//**************************************************************************************
		
		
	   // print first 10 even numbers
		
		IntStream.range(1, 10).map(c->c*2).forEach(System.out::println);
		
		//**************************************************************************************
		
		//most repeated word
		
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

		Map<String, Long> collect2 = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Entry<String, Long> entry = collect2.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println(entry);
		
		//*********************************************************************************************
		
		//  palindrome
		
		String s3="ROTATOR";
		
		boolean allMatch = IntStream.range(0, s3.length()/2).allMatch(i->s3.charAt(i)==s3.charAt(s3.length()-i-1));
		
		System.out.println(allMatch);
		
		//*************************************************************************************************
		
		//words having digits
		
		List<String> listOfString = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		
		
		listOfString.stream().filter(f->Character.isDigit(f.charAt(0))).forEach(System.out::println);
		
		//****************************************************************************************************
		
		// print duplicate nums
		List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		
		Set<Integer> hash=new HashSet<>();
		
		List<Integer> collect3 = listOfIntegers.stream().filter(i->!hash.add(i)).collect(Collectors.toList());
		
		System.out.println(collect3);
		
		//****************************************************************************************************
		
		//find last element
		
		 List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
		
		String string = list.stream().skip(list.size()-1).findFirst().get();
		 System.out.println(string);
		 
		 //****************************************************************************************************
		 
		 String str= "java concepts of the day".replace(" ", ""); 
		 
		 Map<Character, Long> charCountMap = str.chars().mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	        System.out.println("Duplicate characters in the string:");
	        charCountMap.entrySet().stream()
	            .filter(f -> f.getValue() > 1)
	            .forEach(f -> System.out.println(f.getKey() + ": " + f.getValue()));
	
		 //*****************************************************************************************************
	        
	        
	        LocalDate bday=LocalDate.of(2000, 10, 04);
	        LocalDate today=LocalDate.now();
	        
	        System.out.println(ChronoUnit.YEARS.between(bday, today));
	        
	        
	        
	        
	        //***********************************************************************************************
	        
//	        Map<String, Integer> sortedMap = map.entrySet()
//	                .stream()
//	                .sorted(Map.Entry.comparingByValue()) // Sorting by values
//	                .collect(Collectors.toMap(
//	                        Map.Entry::getKey,
//	                        Map.Entry::getValue,
//	                        (oldValue, newValue) -> oldValue,
//	                        LinkedHashMap::new // Preserves insertion order
//	                ));
//
//	        System.out.println(sortedMap);
//   
	      //  *****************************************************************************************************
	        
	        final List<String> fruits=new ArrayList<>();
	        fruits.add("one");
	        fruits.add("three");
	        fruits.set(0, "yetu");
	        System.out.println(fruits);
	}

}
