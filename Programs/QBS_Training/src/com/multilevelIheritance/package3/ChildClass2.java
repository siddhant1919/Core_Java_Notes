package com.multilevelIheritance.package3;
import com.multilevelIheritance.package2.ChildClass;

public class ChildClass2 extends ChildClass
{
	
	ChildClass2()
	{
		System.out.println("in child class 2");
	}
	
	void set_teamName(String teamName)
	{
		super.teamName = teamName;
	}
	
	void set_managerName(String managerName)
	{
		super.managerName = managerName;
	}
	
	
	
	
	protected void finalize() {
		System.out.println("Calling finilize method to clear resources");
	}
	
	
	

	public static void main(String args[])
	{
		
		ChildClass2 c2 = new ChildClass2();
		c2.set_teamName("Java devs");
		c2.set_managerName("David");
		System.out.println(c2.teamName);
		c2.changeName("sid");
		c2.changeSalary(30000);
		c2.changeDesignation("tester");
		c2.changePhoneNo(9382047628L);
		c2.displayChangedInfo();
		
		System.gc();
		
		
		
	}
}
