package com.assignment.Employees;

public class AadharId 
{
	long aadharNo;
	
	AadharId()
	{
		this.aadharNo = 000000000000L;
	}
	
	AadharId(long aadharNo)
	{
		this.aadharNo = aadharNo;
	}
	
	public long get_aadharNo()
	{
		return this.aadharNo;
	}
	
	public void set_aadharNo(long aadharNo)
	{
		this.aadharNo = aadharNo;
	}
	
}
