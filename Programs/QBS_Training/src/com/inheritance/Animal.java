package com.inheritance;

class Animal {
	
	Animal()
	{
		System.out.println("Animal Constuctor");
	}
	public void eat() {
		System.out.println("Eating");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping");
	}
	
	public void walk()
	{
		System.out.println("Walking");
	}
}


// Single inheritance
class Dog extends Animal
{
	Dog()
	{
		System.out.println("Dog constructor");
	}
	
	protected void bark()
	{
		System.out.println("Bark");
	}
}


// multilevel inheritance
class Puppy extends Dog
{
	Puppy()
	{
		System.out.println("Puppy Constructor");
	}
	protected void Puppy_play()
	{
		System.out.println("puppy playing");
	}
}


// heirarchical inheritance
class Cat extends Animal
{
	Cat()
	{
		System.out.println("Cat constructor");
	}
	
	protected void meow()
	{
		System.out.println("Meowing");
	}
}

class Kitten extends Cat
{
	Kitten()
	{
		System.out.println("Kitten Constructor");
	}
	protected void kitten_play()
	{
		System.out.println("Kitten playing");
	}
	
}
	


