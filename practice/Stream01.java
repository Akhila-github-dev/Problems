package com.practice;

import java.util.List;

public class Stream01 {

	public static void main(String[] args) {

		
		List<Integer> emp=List.of(3000,1000,500,6000,3200);
		emp.stream().filter(f->f>1000).map(n->n+500).forEach(System.out::println);



//list of strings and returns a new list containing only the strings that contain the letter 'a' in them

		List<String> list= List.of("java","sql","as","spring","iq");
	
		list.stream().filter(f->f.contains("a")).forEach(System.out::println);
	//=========================================================================================================================
		// list of integers and returns the sum of the square of each number in the list. 
		List<Integer> li = List.of(1, 2, 3);
		
			Optional<Integer> reduce2 = li.stream().map(m->m*m).reduce((a,b)->a+b);
		System.out.println(reduce2.get());
		
		
		Optional<Integer> reduce3 = li.stream().map(m->m*m).reduce(Integer::sum);
		
		System.out.println(reduce3);
	//===============================================================================================================
// list of integers and returns a new list containing only the prime numbers
		List<Integer> collect = li.stream()
        .filter(number -> number > 1 && 
                IntStream.rangeClosed(2, (int) Math.sqrt(number))
                         .noneMatch(i -> number % i == 0))
           .collect(Collectors.toList());
		System.out.println(collect);

//============================================================================================================
// list of integers and returns the average of all the odd numbers in the list. 
		
			OptionalDouble average = li.stream().filter(f->f%2!=0).mapToInt(Integer::intValue).average();
			System.out.println(average.getAsDouble());

//=======================================================================================================
		//list of strings and returns a new list containing the strings that have the letter 'e' as the second letter.
		
		list.stream().filter(f-> f.charAt(1)=='e').collect(Collectors.toList());
//============================================================================================================
//Write a Java 8 lambda expression to sort a list of doubles in ascending order
	
	List<Double> list=Arrays.asList(2.3,1.2,3.5,5.0,3.2,3.0);
	list.stream().sorted().forEach(System.out::println);
	list.sort((a,b)-> Double.compare(a, b));
	System.out.println(list);

//=========================================================================================
	//list of strings and returns a new list containing only the strings that are not longer than four characters
		List<String> str = List.of("java", "sql", "aws", "ms", "spring");
		List<String> collect = str.stream().filter(f -> f.length() <= 4).collect(Collectors.toList());
		System.out.println(collect);
//==============================================================================================================
		// list of integers and returns a new list containing only the numbers that are divisible by 3. 
		List<Integer> li=List.of(1,2,3,4,6,9,21,30,5,7,8);
		li.stream().filter(f->f%3==0).forEach(System.out::println);
//=============================================================================================================
//list of strings and returns a new list containing the strings in uppercase.
		str.stream().map(f-> f.toUpperCase()).forEach(System.out::println);
//===========================================================================================================
// a list of strings and returns a new list containing only the strings that start with a vowel.

		str.stream().filter(f -> f.startsWith("a") || f.startsWith("e") || f.startsWith("i") || f.startsWith("o")
				|| f.startsWith("u")).forEach(System.out::println);
	str.stream().filter(f->f.matches("^[aeiouAEIOU].*")).forEach(System.out::println);
//=======================================================================================================
		
//a list of integers and returns a new list containing the absolute value of each number in the original list. 
		List<Integer> abs  =List.of(1,-5,3,-7,9);
		abs.stream().map(Math::abs).forEach(System.out::println);

//===============================================================================
str.stream().filter(f-> f.endsWith("s")).forEach(System.out::println);
//==========================================================================
//Java 8 lambda expression to sort a list of longs in descending order.
		 List<Long> numbers = Arrays.asList(5L, 3L, 8L, 1L, 7L);
		 
		 numbers.sort((a,b)-> Long.compare(b, a));
		// Sorting in descending order using lambda expression
		 System.out.println(numbers);
//====================================================================================
//a list of integers and returns the smallest prime number in the list
		Optional<Integer> max = li.stream()
		        .filter(number -> number > 1 && 
		                IntStream.rangeClosed(2, (int) Math.sqrt(number))
		                         .noneMatch(i -> number % i == 0)).min(Integer::compareTo);
		System.out.println(max.get());
//================================================================================================

		
	}


//

	}

}
	
	}
	

}
