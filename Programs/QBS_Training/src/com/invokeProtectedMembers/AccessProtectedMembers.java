package com.invokeProtectedMembers;

import com.accessSpecifiers.AccessModifiersDemo;

public class AccessProtectedMembers extends AccessModifiersDemo
{

	public static void main(String[] args) 
	{
		AccessProtectedMembers a = new AccessProtectedMembers();
		a.protectedVar = 10;
		System.out.println(a.protectedVar);
		a.protectedMethod();
	}

}
