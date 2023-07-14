package com.typecasting;

class Animal
{
	void makeNoice()
	{
		System.out.println("Animal making noice");
	}
}

class Dog extends Animal
{
	void makeNoice()
	{
		System.out.println("Bark Bark");
	}
	
	void growl()
	{
		System.out.println("GRRRRRRRRR");
	}
}

class Cat extends Animal
{
	void makeNoice()
	{
		System.out.println("Meow Meow");
	}
	
	void Hiss()
	{
		System.out.println("HISSSSSSS");
	}
}

public class UpAndDowncastinWRefVariable {
	
	void doingAnimalThings(Animal animal)
	{
		animal = new Dog();
	}

	public static void main(String[] args) 
	{
//		Upcasting
		
		Animal A = new Dog();
		A.makeNoice();
		A = new Cat();
		A.makeNoice();
		
//		Downcasting
//		Dog d = (Dog)new Animal();  // by doing this we cannot access d.bark();
//		d.makeNoice();              // Shows exception
		
		Animal A2 = new Dog();
		Dog d2 = (Dog) A2;          // // by doing this we can access d2.bark();
		d2.makeNoice();
		d2.growl();
		
		Animal A3 = new Cat();
		Cat c2 = (Cat) A3;
		c2.makeNoice();
		c2.Hiss();
		
		
		
	
		

	}

}
