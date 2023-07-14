package com.variables;


public class Variables {
	
	static int m=100;      //static variable 
	
    void method()  
    {    
      int n=90;         //local variable 
      System.out.println(n);
    }  

	public static void main(String[] args) 
	{
		int data=50;      //instance variable  
//		System.out.print(n);
		System.out.println(m+" "+" "+data+"\n");
		
		Variables d = new Variables();
		d.method();	
		System.out.println(Variables.m);
		
	}
}
