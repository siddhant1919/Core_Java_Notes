package com.practice;

import ExceptionHandling.UnderageException;

public class Employee
{
	private String name;
	private int emp_id;
	private String designation;
	
	Employee()
	{
		this.name = "Defualt";
		this.emp_id = 100;
		this.designation = "Defualt";
	}
	
	Employee(String name, int emp_id, String designation)
	{
		this.name = name;
		this.emp_id = emp_id;
		this.designation = designation;
	}
	
	public String get_name()
	{
		return this.name;
	}
	
	public int get_emp_id()
	{
		return this.emp_id;
	}
	
	public String get_designation()
	{
		return this.designation;
	}
	
	public void set_name(String name)
	{
		
		this.name = name;
	}
	
	public void set_emp_id(int emp_id)
	{
		try {
			if(emp_id<=0)
			{
				throw new IdException("Id cannot be 0 or less");
			}
			else {
				this.emp_id = emp_id;
			}
		}
		catch(IdException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void set_designation(String designation)
	{
		this.designation = designation;
	}
	
	public void changeId(int id)
	{
		try {
			if(id<=0)
			{
				throw new IdException("Id cannot be 0 or less");
			}
			else {
				this.emp_id = id;
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("changeId() executed");
		}
		
	}
	
	
}
