package com.Reflection;

import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Test newTest = new Test("Siddhant", 21);
		System.out.println(newTest.getClass());   // getting the name of class using object
		
//		Getting methods of a class 
//		Storing it in a Field[] data type becouse getDeclaredFields() returns Field[]
		Field[] fields = newTest.getClass().getDeclaredFields();
		
//		printing the name of fields inside the class using for each loop
		for(Field f: fields)
		{
			System.out.println(f.getName());
		}
		
//		changing the value of private field name to newSiddhant which is 
		for(Field f: fields)
		{
			if(f.getName().equals("name"))
			{
				f.setAccessible(true);            // making all the fields accessible though they are private
				f.set(newTest, "new Siddhant");
				
			}
		}
		System.out.println(newTest.get_name()); 
		
		
//		Getting all the methods name
//		Storing it in a Method[] data type becouse getDeclaredMethods() returns array of Method
		Method[] method = newTest.getClass().getDeclaredMethods();
		
		for(Method m: method)
		{
			if(m.getName().equals("do_work"))
			{
				System.out.println(m.getName());
			}
			
		}
		
		
//		Invoking method using m.invoke(ObjectName);
		for(Method m: method)
		{
			if(m.getName().equals("do_work"))
			{
				m.invoke(newTest);             //invoking do_work() 
			}
		}

		
//		Invoking private method using m.invoke(ObjectName);
		for(Method m: method)
		{
			if(m.getName().equals("thisIsPrivateMethod"))
			{
				m.setAccessible(true);              //making thisIsPrivateMethod accessible
				m.invoke(newTest);                  //invoking thisIsPrivateMethod()
			}
		}
		
		
//		Invoking public static method using m.invoke(null);
		for(Method m: method)
		{
			if(m.getName().equals("thisIsPublicStaticMethod"))
			{
				m.invoke(null);                  //invoking public static method thisIsPublicStaticMethod()
												 // we are using null because static method doesn't require object to get called
			}
		}
		
		
//		Invoking private static method using m.invoke(null);
		for(Method m: method)
		{
			if(m.getName().equals("thisIsPrivateStaticMethod"))
			{
				m.setAccessible(true);           //making thisIsPrivateStaticMethod accessible
				m.invoke(null);                  //invoking public static method thisIsPrivateStaticMethod()
												 // we are using null because static method doesn't require object to get called
			}
		}
		
		
		
		
	}

}
