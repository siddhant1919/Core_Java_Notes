package com.oops;


class Base{
	
	public int height = 6;
	public int lenght = 10;
	public int width = 25;
	Base()
	{
		System.out.println("Base");
	}
}

class Child extends Base{
	
	public int weight = 60;
//	super();

	Child()
	{
		System.out.println("Child");
		System.out.println(height);
		System.out.println(lenght);
		System.out.println(width);
	}
	
	
}

public class Inheritance {

	

}
