package com.hashSet;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		
		// Create a set of employees
        Set<Employee> employees = new HashSet();
        employees.add(new Employee(101, "John"));
        employees.add(new Employee(102, "Mary"));
        employees.add(new Employee(103, "Bob"));
        employees.add(new Employee(104, "Alice"));
        employees.add(new Employee(101, "John")); // duplicate employee

        // Print the set
        System.out.println(employees);
        
        
        


	}

}
