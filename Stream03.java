package com.emp;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03 {

	public static void main(String[] args) {
		
		//divsible 5 and sum of squares of it
		
		List<Integer> l =List.of(1,4,5,15,10,30,6,8);
		
		Integer reduce = l.stream().filter(f->f%5==0).map(m->m*m).reduce(0,(a,b)->a+b);
        System.out.println(reduce);
        
        //*********************************************************************************
        
        //contains atleast one upper and one lowercase letter
        
        List<String> lis1=Arrays.asList("Monkey","dog","pig","Rabbit","peacock","Owl");
        List<String> collect2 = lis1.stream().filter(f->f.chars().anyMatch(Character::isUpperCase) && f.chars().anyMatch(Character::isLowerCase)).collect(Collectors.toList());
        System.out.println(collect2);

       //**********************************************************************************

         //print which have strings
        
        int arr[]= {2,1,2,3,3,3,4};

        List<String> l1= Arrays.asList("remo1","yog4a","poland");
        List<String> collect = l1.stream().filter(f->f.chars().anyMatch(Character::isDigit)).collect(Collectors.toList());
        System.out.println(collect);

       //**********************************************************************************
        
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2023, 4, 25),
                LocalDate.of(2021, 6, 10),
                LocalDate.of(2022, 12, 5)
            );
        
        //dates.sort(Comparator.naturalOrder());
        dates.sort((a,b)->a.compareTo(b));
        System.out.println(dates);

     //************************************************************************************
        //print string which have only letters
        
         l1.stream().filter(f->f.chars().allMatch(Character::isLetter)).collect(Collectors.toList());
        
     //*************************************************************************************
         



	}

}
