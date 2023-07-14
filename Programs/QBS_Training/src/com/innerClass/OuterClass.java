package com.innerClass;

public class OuterClass {
	int number = 6;
	public void heyThere()
	{
		System.out.println("Hey There");
		
		
//		creating local inner class which is only accessible inside the method in which it is declared. 
		class LocalInnerClass 
		{
			
			String localInnerClassVariable = "localInnerClassVariable";
			
			public void printLocalInnerClassVariable()
			{
				System.out.println(localInnerClassVariable);
			}
		}
		
		LocalInnerClass lic = new LocalInnerClass();
		lic.printLocalInnerClassVariable();
	}
	
	
//	making inner class static
	public static class InnerClass
	{
		int innerVarible = 8;
		
		public void methodFromInnverClass()
		{
			System.out.println("Method From Innver Class");
		}
	}
}
