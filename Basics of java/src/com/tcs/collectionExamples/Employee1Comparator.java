package com.tcs.collectionExamples;

import java.util.Comparator;

public class Employee1Comparator implements Comparator<Employee> {
	

	

	@Override
	public int compare(Employee employee, Employee emp) {
		return employee.getId() - emp.getId();
	}

	
}
