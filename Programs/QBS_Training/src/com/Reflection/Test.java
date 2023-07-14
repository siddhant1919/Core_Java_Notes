package com.Reflection;

public class Test {
	
	private final String name;
	private int age;
	
	Test(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String get_name()
	{
		return this.name;
	}
	
	public int get_age()
	{
		return this.age;
	}
	
	public void set_age(int age)
	{
		this.age = age;
	}
	
	public void do_work()
	{
		System.out.println("Doing work");
	}
	
	private void thisIsPrivateMethod()
	{
		System.out.println("You are calling a private method");
	}
	
	public static void thisIsPublicStaticMethod()
	{
		System.out.println("You are calling a Public Static method");
	}
	
	private static void thisIsPrivateStaticMethod()
	{
		System.out.println("You are calling a Private Static method");
	}
}
