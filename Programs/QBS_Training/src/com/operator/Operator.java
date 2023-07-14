package com.operator;

public class Operator {

	public static void main(String[] args) {
		int x=10;  
		
//		Unary Operator
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
//		Arithmetic Operators
		int a = 10;
		int b=5;  
		System.out.println(a+b);//15  
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		System.out.println(a%b);//0  
		
//		Assignment Operator
		int a1=10;  
		a1+=3;//10+3  
		System.out.println(a1);  
		a1-=4;//13-4  
		System.out.println(a1);  
		a1*=2;//9*2  
		System.out.println(a1);  
		a1/=2;//18/2  
		System.out.println(a1);  
		
//		Ternary Operator
		int a2=2;  
		int b2=5;  
		int min=(a2<b2)?a2:b2;  
		System.out.println(min); 
		

		
		
		
	}

}
