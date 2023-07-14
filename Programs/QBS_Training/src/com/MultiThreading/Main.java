package com.MultiThreading;

public class Main {

	public static void main(String[] args) {
		
//		multithreading using thread class
		ThreadClass t = new ThreadClass();
		t.start();
		t.setPriority(3);
		
//		multithreading using Runnable Interferface
		RunnableInterf ri = new RunnableInterf();
		Thread thrd = new Thread(ri, "runnable Thrd");
		thrd.setPriority(7);
		
//		making thread Daemon
//		System.out.println(thrd.isDaemon());
//		thrd.setDaemon(true);
		
		thrd.start();
		
		
		
		for(int i = 1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+i);
		}

	}

}
