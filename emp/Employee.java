
package com.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparator<Employee> {

	String name;
	int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Employee() {

	}

	@Override
	public int compare(Employee e1, Employee e2) {
		int n = e1.name.compareTo(e2.name);
		if (n == 0) {
			n = e1.age - e2.age;
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