package com.MultiThreading;

public class ThreadClass extends Thread
{
	public void run()
	{
		Thread.currentThread().setName("ThreadClass");
		for(int i = 1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() +i);
		}
	}

}
