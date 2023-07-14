package com.practice;

public class IdException extends RuntimeException
{
	IdException()
	{
		super("id cannot be 0");
	}
	
	IdException(String msg)
	{
		super(msg);
	}
	

}
