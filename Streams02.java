package com.emp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams02 {

	public static void main(String[] args) {
	
		
		List<String> strings= List.of("java","sql","as","apring","iq");
		char c='a';
		List<String> collect2 = strings.stream().filter(f->f.startsWith(String.valueOf(c))).collect(Collectors.toList());
		System.out.println(collect2);
		
		//************************************************************************************************************
		
		//String first letter to uppercase
		
		List<String> collect = strings.stream().map(m-> m.substring(0,1).toUpperCase()+ m.substring(1)).collect(Collectors.toList());
		
		System.out.println(collect);
		
	   //*************************************************************************************************************
		
		   // product of all
		
	        List<Integer> li = List.of(1, 2, 3);
			Optional<Integer> reduce = li.stream().reduce((a,b)->a*b);
			System.out.println(reduce.get());
			
	  //**************************************************************************************************************
			
			List<String> string= List.of("java","sql","as","new","spring","iq");
			
			string.stream().filter(m->m.length()==3).forEach(System.out::println);
			
			
     //*******************************************************************************************************************
			
			//letter e as a second letter
			
			List<String> lis=Arrays.asList("monkey","dog","pig","rabbits","peacocks","owl");
	       lis.stream().filter(f->f.charAt(1)=='e').forEach(System.out::println);
		    
	  //******************************************************************************************************************	
		    //strings that contain the letter 'a' 
		    
		    List<String> collect3 = lis.stream().filter(f->f.contains("a")).collect(Collectors.toList());
		    System.out.println(collect3);
		    
	   //****************************************************************************************************************
		    //prime numbers
		    
	        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
            
		    List<Integer> collect4 = list.stream().filter(f->f>1 && IntStream.rangeClosed(2, (int) Math.sqrt(f)).noneMatch(i->f%i==0)).collect(Collectors.toList());
		    System.out.println(collect4);
		    
	   //****************************************************************************************************************
		    
		    // avg of odd numbers
		    
		    OptionalDouble mapToInt = list.stream().filter(f->f%2!=0).mapToInt(Integer::intValue).average();
		    System.out.println(mapToInt.getAsDouble());
		    
	   //******************************************************************************************************************   
		    // lambda expression to sort a list of doubles in ascending order
		    
		    List<Double> l=Arrays.asList(23.4,45.7,89.0,34.3,98.6);;
			
	      	l.sort((a,b)->Double.compare(a, b));
			System.out.println(l);
			
		//***************************************************************************************************************
       
                 // total number of characters in all strings
			
			lis.stream().map(f->f.length()).forEach(System.out::println);
			
			
			//***********************************************************************************************************
			//convert to uppercase
			
			lis.stream().map(String::toUpperCase).forEach(System.out::println);
			
			//***********************************************************************************************************
			
			//starts with vowel
			
			List<String> lis1=Arrays.asList("monkey","dog","pig","rabbit","peacock","owl");
			
			lis1.stream().filter(f->f.matches("^[AEIOUaeiou].*")).forEach(System.out::println);
			
			//*********************************************************************************************************
			
			//absolute values
			
			 List<Integer> ls = List.of(1, 2, -3, 4, -5, 6);
			 ls.stream().map(Math::abs).forEach(System.out::println);
			 
			 //*******************************************************************************************************
			 
			 //ends with letter
			 
			 lis.stream().filter(f->f.endsWith("s")).forEach(System.out::println);
}
}