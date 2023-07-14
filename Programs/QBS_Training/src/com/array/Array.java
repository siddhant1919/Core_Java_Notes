package com.array;

public class Array {
	
	public static void main(String arg[])
	{
		int a[]=new int[5];//declaration 
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array
		{
			System.out.println(a[i]);  
		}
		
		
		System.out.println();  
		
		int a1[]={33,3,4,5};
		//printing array  
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);  
		}
		
		
	}
}
