package com.thisAndSuper;

public class Vehicle {
	private String brand;
	private String model;
	
	public Vehicle(String brand, String model)
	{
		this.brand  = brand;
		this.model = model;
	}
	
	public void displayInfo()
	{
		System.out.print("Brand-"+this.brand);
		System.out.print(" Model-"+this.model);
	}
	
}
