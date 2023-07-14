package com.innerClass;

public class MainClass {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.heyThere();
		
//		If inner class is not static we can access it by outerclass's object(oc)
//		OuterClass.InnerClass ic = oc.new InnerClass();
//		ic.methodFromInnverClass();
		
//	    If inner class is static we doesn't need outerclass's object(oc)
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.methodFromInnverClass();

	}

}
