package com.multilevelIheritance.package2;

import com.multilevelIheritance.package1.*;

public class ChildClass extends ParentClass
{
	protected String teamName;
	protected String managerName;
	
	
	public ChildClass()
	{
		System.out.println("in child class ");
	}
	
	protected void changeName(String name)
	{
		super.name = name;
	}
	
	protected void changeSalary(int salary)
	{
		super.salary = salary;
	}
	
	protected void changeDesignation(String designation)
	{
		super.designation = designation;
	}
	
	protected void changePhoneNo(long phoneNo)
	{
		super.setPhoneNo(phoneNo);
	}
	
	
	
	protected void displayChangedInfo()
	{
		System.out.println(super.name + super.salary + super.designation + super.getPhoneNo());
	}
	
	

}
