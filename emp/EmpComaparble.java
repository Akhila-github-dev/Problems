package com.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpComaparble implements Comparable<EmpComaparble> {

		String name;
		int age;

		public EmpComaparble(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public EmpComaparble() {

		}

		@Override
		public int compareTo(EmpComaparble e) {

			int n = this.age - e.age;
			if (n == 0) {
				n = this.name.compareTo(e.name);
			}
			return n;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + "]";
		}

		public static void main(String[] args) {
		
	        List<EmpComaparble> list = new ArrayList<>();
			list.add(new EmpComaparble("akhi", 19));
			list.add(new EmpComaparble("bhanu", 20));
			list.add(new EmpComaparble("akhi", 20));
			list.add(new EmpComaparble("prassu", 22));
			list.add(new EmpComaparble("akhi", 1));
			list.add(new EmpComaparble("bhanu", 19));
			list.add(new EmpComaparble("bhanu", 28));

			Collections.sort(list);
			System.out.println(list);
		}

}
