package com.patterns;

public class Practice {

	
//	*
//	**
//	***
//	****
//	*****
	
	public void traingle(int n)
	{
		String str = "*";
		
		for(int i = 1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(str);
			}
			System.out.println();
		}
	}
	
	public void reverseTraingle(int n)
	{
		String str = "*";
		
		for(int i = n; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(str);
			}
			System.out.println();
		}
	}
	

	
//	0000*
//	000**
//	00***
//	0****
//	*****
	
	public void flickedTraingle(int n)
	{
		String str = "*";
		String space = " ";
		int temp = n - 1;
		int count  = temp;
		
		for(int i = 1; i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				if(count!=0)
				{
					System.out.print(" ");
					count--;
				}
				else {
					System.out.print(str);
				}
			}
			temp--;
			count = temp;
			System.out.println();
		
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		Practice p = new Practice();
		p.traingle(5);
		System.out.println();
		p.reverseTraingle(5);
		System.out.println();
		p.flickedTraingle(5);
		

	}

}
