package com.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("How many employee you want to enter");
		Scanner s = new Scanner(System.in);
		int numberOfEmployyes = s.nextInt();
		
		for(int i = 1; i<=numberOfEmployyes; i++)
		{
			System.out.println("enter name");
			Scanner s1 = new Scanner(System.in);
			String name = s1.next();

			System.out.println("enter id");
			Scanner s2 = new Scanner(System.in);
			int emp_id = s2.nextInt();
			
			System.out.println("enter designation");
			Scanner s3 = new Scanner(System.in);
			String designation = s3.next();
			
			Employee e = new Employee();
			e.set_name(name);
			e.set_emp_id(emp_id);
			e.set_designation(designation);
			
			System.out.println(e.get_name());
			System.out.println(e.get_emp_id());
			System.out.println(e.get_designation());
			
			System.out.println("do you want to change id yes/no");
			Scanner s4 = new Scanner(System.in);
			String answer = s4.next();
			
			if(answer.equals("yes"))
			{
				System.out.println("enter the id");
				Scanner s5 = new Scanner(System.in);
				int id = s5.nextInt();
			}
			else {
				System.exit(1);
			}
		}
		
		
		
		
		
		

	}

}
