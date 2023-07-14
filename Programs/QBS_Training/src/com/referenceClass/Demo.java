package com.referenceClass;

class Demo {
	FirstReferenceClass reference1;
	SecondReferenceClass reference2;
	
	Demo(){
		this.reference1 = new FirstReferenceClass();
		this.reference2 = new SecondReferenceClass();
	}
	
	void runReferenceClasses()
	{
		this.reference1.methodOfFirstReferenceClass();
		this.reference2.methodOfSecondReferenceClass();
	}
}

class FirstReferenceClass {
	void methodOfFirstReferenceClass() {
		System.out.println("firstReferenceClass");
	}
}

class SecondReferenceClass{
	void methodOfSecondReferenceClass() {
		System.out.println("SecondReferenceClass");
	}
}






