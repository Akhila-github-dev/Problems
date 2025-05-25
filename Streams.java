package com.emp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class Streams {

	public static void main(String[] args) {
		
        String s="java concept of the day";
	
	   Map<Character, Long> m=s.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(m);
		
//   ****************************************************************************************************************************
		//String and their count
		
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        
        Map<String, Long> collect = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect);
	
  //*******************************************************************************************************************************
	
        //print from desc
        
	List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
	
	decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
	//*****************************************************************************************************************************
    
	//joining , [ ]
	
	List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
    
    String collect1 = listOfStrings.stream().collect(Collectors.joining(", " ,"[","]"));
    System.out.println(collect1);
    
    //*******************************************************************************************************************************
    //multiples of 5
    
    List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
    
    listOfIntegers.stream().filter(m1->m1%5==0).forEach(System.out::println);
    
    //*****************************************************************************************************************************
    
    //max limit
    
    
    Integer integer = listOfIntegers.stream().sorted().max(Comparator.naturalOrder()).get();
    
    System.out.println(integer);
    
    //*******************************************************************************************************************************
    
    //merge array in sorted way
    
    int a[]= {4,6,7};
    int b[]= {3,1,2};
    
    int c[]=IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
    //System.out.println(Arrays.toString(c));
    
    //********************************************************************************************************************************

	//first 3 numbers

    List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	
    listOfIntegers1.stream().sorted().limit(3).forEach(System.out::println);
    
    listOfIntegers1.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    
	
	//***************************************************************************************************************************
    //Anagram
    
    String s1 = "RaceCar";
    String s2 = "CarRace";
    
    s1=Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
    s2=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
   
    if(s1.equals(s2)) {
    	System.out.println("both are anagrams");
    }else {
    	System.out.println("not");
    }
	
	
	//****************************************************************************************************************************
    
    int i =98340; //sum of integers
	
	int j=String.valueOf(i).chars().map(Character::getNumericValue).sum();
	
	System.out.println(j);
    
    
    //*************************************************************************************************************************8
    //second smallest 
	
	List<Integer> listOfIntegers11 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	
	
	listOfIntegers11.stream().sorted().limit(2).skip(1).forEach(System.out::println);
    
	Optional<Integer> findFirst = listOfIntegers11.stream().sorted().skip(1).findFirst();
    
    System.out.println(findFirst.get());
    
    // second largest
    
    Optional<Integer> findFirst2 = listOfIntegers11.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    
    System.out.println(findFirst2.get());
    
    //*************************************************************************************************************************
    
    
    
    List<String> list1 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

	list1.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
	
	//************************************************************************************************************************
	
	// get avg and sum
	
	int p[]= {1,2,3,4,5,6};
	
	OptionalDouble average = Arrays.stream(p).average();
	System.out.println(average.getAsDouble());
	
	int sum = Arrays.stream(p).sum();
	System.out.println(sum);
	
	//************************************************************************************************************************
	
	//print common num in both the arrays
	
	
	List<Integer> st=List.of(1,2,3,4);
	List<Integer> ist=List.of(1,3,5,6);
	
    st.stream().filter(ist::contains).forEach(System.out::println);;
	
	//************************************************************************************************************************
    
    
     String str="java concepts of the day";
     
     String collect2 = Stream.of(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
	
	 System.out.println(collect2);
	
	

	}
}