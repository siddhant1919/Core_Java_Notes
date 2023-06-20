package com.patterns;

public class Patterns 
{
	
	
	static void traingle(int n)
	{
		String s = "* ";
		
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j <=i; j++)
			{
				System.out.print(s);
			}
			System.out.println();
		}
	}
	
	static void reverseTraingle(int n)
	{
		String s = "*";
		
		for(int i = 1; i<=n; i++)
		{
			
			for(int j = 1; j <=n-i+1; j++)
			{
				System.out.print(s);
				
			}
			System.out.println();
		}
	}
	
	static void traingleUsingNum(int n)
	{
		for(int i = 1; i<=n; i++)
		{
			int num = 0;
			for(int j = 1; j<=i; j++)
			{
				num++;
				System.out.print(num);	
			}
			System.out.println();
		}
	}
	
	static void pyramid(int n)
	{
		
		int spaces = n;
		for(int i = 1; i<=n; i++)
		{
			for(int k = spaces-1; k>=1; k--)
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j <=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			spaces--;
		}
	}
	
	static void reversePyramid(int n)
	{
		
		int spaces = n;
		for(int i = 1; i<=n; i++)
		{
			for(int k = 0; k<=spaces-1; k++)
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j <=n-i+1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			spaces++;
		}
	}

	public static void main(String[] args) 
	{
//		traingle(5);	
//		reverseTraingle(5);
//		traingleUsingNum(5);
//		pyramid(5);
		reversePyramid(5);
		

	}

}
