package com.thisAndSuper;

public class Car extends Vehicle{
	
	private int numOfDoors;
	
	public Car(String brand, String model, int numOfDoors)
	{
		super(brand, model);
		this.numOfDoors = numOfDoors;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.print(" Number of doors-"+this.numOfDoors);
	}

}
