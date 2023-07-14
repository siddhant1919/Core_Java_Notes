package com.practice;

public class PracticeTwo {
	
	void modify(int n)
	{
		n = n * 2;
		System.out.println(n);
	}

	public static void main(String[] args) {
		PracticeTwo pt = new PracticeTwo();
		
		int k = 10;
		
		pt.modify(k);
		
		System.out.println(k);

	}

}
