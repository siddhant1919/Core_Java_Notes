package com.assignment.Employees;

public class Employee {
	
//	Encapsulating data members
	protected String name;
	protected int Emp_id;
	protected String role;	
	protected int salary;
	protected AadharId aadhar = new AadharId();
	
	public Employee()
	{
		this.Emp_id=0;
		this.name="Default";
		this.salary=0;
		System.out.println("Parent constructor");
		System.out.println(aadhar.get_aadharNo());
	}
	
	Employee(String name, int Emp_id, int salary, String role, AadharId aadhar)
	{
		
		this.name = name;
		this.Emp_id = Emp_id;
		this.salary = salary;
		this.role = role;
		this.aadhar = aadhar;
	}
	
	Employee(Employee e)
	{
		this.name = e.name;
		this.Emp_id = e.Emp_id;
		this.salary = e.salary;
		this.role = e.role;
		this.aadhar = e.aadhar;
	}
	


//	getter methods
	public String get_emp_name()
	{
		return this.name;
	}
	
	public int get_emp_id()
	{
		return this.Emp_id;
	}
	
	public int get_emp_salary()
	{
		return this.salary;
	}
	
	public String get_emp_role()
	{
		return this.role;
	}
	

	
	
//	setter methods
	public void set_emp_name(String name)
	{
		this.name = name;
	}
	
	public void set_emp_id(int Emp_id)
	{
		this.Emp_id = Emp_id;
	}
	
	public void set_emp_salary(int salary)
	{
		this.salary = salary;
	}
	
	public void set_emp_role(String role)
	{
		this.role = role;
	} 
	
	

}




