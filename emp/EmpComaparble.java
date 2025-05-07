package com.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpComaparble implements Comparable<Employee> {

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
		public int compareTo(Employee e) {

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
		
	        List<Employee> list = new ArrayList<>();
			list.add(new Employee("akhi", 19));
			list.add(new Employee("bhanu", 20));
			list.add(new Employee("akhi", 20));
			list.add(new Employee("prassu", 22));
			list.add(new Employee("akhi", 1));
			list.add(new Employee("bhanu", 19));
			list.add(new Employee("bhanu", 28));

			Collections.sort(list, new Employee());
			System.out.println(list);
		}

}
