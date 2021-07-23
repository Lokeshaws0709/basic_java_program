package com.tcs.collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Employee> e = new ArrayList<>();
		Employee e1 = new Employee(104);
		Employee e2 = new Employee(101);
		Employee e3 = new Employee(108);
		Employee e4 = new Employee(102);
		Employee e5 = new Employee(107);
		Employee e6 = new Employee(110);
		Employee e7 = new Employee(103);
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		e.add(e6);
		e.add(e7);

		System.out.println(e);
		Collections.sort(e, new Employee1Comparator());
		for (Employee emp : e) {

			System.out.println(emp);

		}

	}
}
