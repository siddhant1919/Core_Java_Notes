package com.finalize;

public class FinalizeMethod {
	
	private String name;
	
	public FinalizeMethod(String name) 
	{
		this.name = name;
	}
	
	public void finalize()
	{
		System.out.println(name+" Garbage is being collecting");
	}
	public static void main(String[] args) {
		FinalizeMethod f1 = new FinalizeMethod("ABCD");
		FinalizeMethod f2 = new FinalizeMethod("EFGH");
		
		f1 = null;
		f2 = null;
		
		System.gc();

	}

}
