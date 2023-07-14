package com.controlStatements;

public class ControlStatements {

	public static void main(String[] args) 
	{
//		if-else
		int x = 10;  
		int y = 12;  
		if(x+y < 10) 
		{  
		System.out.println("x + y is less than      10");  
		}   
		else 
		{  
		System.out.println("x + y is greater than 20");  
		}  
		
//		switch-case
		int num = 2;  
		switch (num)
		{  
		case 0:  
		System.out.println("number is 0");  
		break;  
		case 1:  
		System.out.println("number is 1");  
		break;  
		case 2:  
		System.out.println("number is 2");  
		break;  
		default:  
		System.out.println(num); 	
		}
		
//		for loop
		int sum = 0;  
		for(int j = 1; j<=10; j++) 
		{  
		sum = sum + j;  
		}  
		System.out.println("The sum of first 10 natural numbers is " + sum);  
		
//	    while loop
		int i = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		while(i<=10) 
		{    
		System.out.println(i);    
		i = i + 2;    
		}    
		
//		do-while loop
		int i1 = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		do {    
		System.out.println(i1);    
		i1 = i1 + 2;    
		}while(i1<=10); 
		
		System.out.println();  
		
//		break
		for(int j = 0; j<= 10; j++) 
		{  
			System.out.println(j);  
			if(j==6) 
			{  
			break;  
			}  
		}  
		System.out.println();  
		
//		continue (skip)
		for(int k = 0; k<= 10; k++) 
		{  
			  
			if(k==6) 
			{  
				continue;  
			}  
			System.out.println(k);  
		}  
	}

}
