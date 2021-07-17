package com.tcs.collectionExamples;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	int id;
	String name;
	int salary;
	
	

	public Customer(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	

	

	

	public static void main(String[] args) {

		Set<Customer> s = new HashSet<>();

		Customer c1 = new Customer();
		c1.setId(101);
		c1.setName("Lokesh");
		c1.setSalary(1000);

		Customer c2 = new Customer();
		c2.setId(101);
		c2.setName("Lokesh");
		c2.setSalary(1001);

		s.add(c1);
		s.add(c2);
		System.out.println(s);
		
		for(Customer cust : s) {
			
			System.out.println(s);
		}

	}

}
