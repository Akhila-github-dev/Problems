package com.practice;

import java.util.List;

public class Stream01 {

	public static void main(String[] args) {

		
		List<Integer> emp=List.of(3000,1000,500,6000,3200);
		emp.stream().filter(f->f>1000).map(n->n+500).forEach(System.out::println);
	
	
	}
	

}
