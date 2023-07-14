package com.accessSpecifiers;


public class AccessModifiersDemo {
	
	 public int publicVar;
	 private int privateVar;
	 protected int protectedVar;
	 int defaultVar;
	 
	 public void publicMethod() {
	        System.out.println("This is a public method.");
	    }
	    
	 private void privateMethod() {
	        System.out.println("This is a private method.");
	    }
	    
	 protected void protectedMethod() {
	        System.out.println("This is a protected method.");
	    }
	    
	  void defaultMethod() {
	        System.out.println("This is a default method.");
	    }

	public static void main(String[] args) 
	{
		AccessModifiersDemo obj = new AccessModifiersDemo();
        
        obj.publicVar = 1;
        obj.privateVar = 2; 
        obj.protectedVar = 3;
        obj.defaultVar = 4;
        
        obj.publicMethod();
        obj.privateMethod(); 
        obj.protectedMethod();
        obj.defaultMethod();
		

	}

}
