package com.array;

public class Employee {
	
	private String name;
	private int id;
	private int salary;
	
	Employee(String name, int id, int salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	

	public static void main(String[] args) 
	{
		
		Employee[] e = new Employee[3]; 
		
		e[0] = new Employee("ABCD", 1000, 25000);
		e[1] = new Employee("EFGH", 1001, 30000);
		e[2] = new Employee("IJKL", 1002, 20000);
		

		
		

	}

}
