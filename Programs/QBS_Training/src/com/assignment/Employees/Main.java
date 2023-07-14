package com.assignment.Employees;

public class Main {

	public static void main(String[] args) {
		Employee emp_1 = new Employee("Aryan", 001, 25000, "developer",new AadharId(963675368652L));
		Employee emp_2 = new Employee("Neha", 003, 23000, "tester", new AadharId(927342956354L));
		
		emp_1.get_emp_name();
		emp_2.get_emp_role();
		System.out.println(emp_1.aadhar.get_aadharNo()); 
		
		System.out.println(emp_1.get_emp_name());
		emp_1.set_emp_salary(30000);
		System.out.println(emp_1.get_emp_salary());
		System.out.println(emp_2.get_emp_name());
	}

}
