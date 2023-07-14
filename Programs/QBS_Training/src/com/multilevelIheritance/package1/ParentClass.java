package com.multilevelIheritance.package1;

public class ParentClass {
	
//	Create a demo application to understand the role of access modifiers. Implement multilevel inheritance using different packages.
//	Access/invoke protected members/methods of a class outside the package. Override finalize method to understand the behavior of JVM garbage collector.
	
	
	public String companyName;
	protected String name;
	protected int salary;
	protected String designation;
	private long phoneNo;
	
	public ParentClass() {
		this.name = " ";
		this.salary = 0;
		this.designation = " ";
		this.phoneNo = 0;
		System.out.println("in parent class ");
	
	}
	
	
	public ParentClass(String name, int salary, String designation, long phoneNo) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.phoneNo = phoneNo;
	}
	
	protected void displayInfo()
	{
		System.out.println(this.name + this.salary + this.designation + this.phoneNo);
		
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	protected void finalize()
	{
		System.out.println("Calling finilize method to clear resources");
	}

	
	
	
	

}
