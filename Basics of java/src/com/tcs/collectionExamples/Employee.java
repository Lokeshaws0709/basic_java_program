package com.tcs.collectionExamples;

public class Employee implements Comparable<Employee> {

	int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	@Override
	public int compareTo(Employee employee) {
		return id - employee.getId();
	}

}
