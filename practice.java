package com.emp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class practice {

	public static void main(String[] args) {

		List<String> s = Arrays.asList("abc", "gdhj", "jhf", "uio");

		// s.stream().map(i->i+" "+i.length()).sorted().forEach(System.out::println);

		s.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);

		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(f -> f % 2 == 0));
		System.out.println(map);

		for (Entry<Boolean, List<Integer>> i : map.entrySet()) {
			if (i.getKey()) {
				System.out.println("even num :" + i.getValue());
			} else {
				System.out.println("odd :" + i.getValue());
			}

			// **********************************************
			map.forEach((k, v) -> System.out.println(k + " " + v));

		}
	}

}
