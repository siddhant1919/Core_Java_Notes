package com.defaultValuesOfVariables;

public class Demo {
	
	Boolean one ;
	byte a ; 
	byte b ;
	short c ; 
	short d ; 
	long e ;
	long f ;
	float f1 ;
	double d1 ;
	char letterA ;
	String s;
	
	static Boolean staticone ;
	static byte statica ; 
	static byte staticb ;
	static short staticc ; 
	static short staticd ; 
	static long statice ;
	static long staticf ;
	static float staticf1 ;
	static double staticd1 ;
	static char staticletterA ;
	static String statics;
	
	
	
	Demo()
	{
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.d);
		System.out.println(this.e);
		System.out.println(this.f);
		System.out.println(this.f1);
		System.out.println(this.d1);
		System.out.println(this.letterA);
		System.out.println(this.s);

		
	}
	
	
	
	
	public static void main(String[] args) {
	
		Demo d  = new Demo();		
		
		System.out.println(statica);
		System.out.println(staticb);
		System.out.println(staticc);
		System.out.println(staticd);
		System.out.println(statice);
		System.out.println(staticf);
		System.out.println(staticf1);
		System.out.println(staticd1);
		System.out.println(staticletterA);
		System.out.println(statics);
		

	}

}
