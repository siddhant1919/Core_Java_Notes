package ExceptionHandling;

public class UnderageException extends RuntimeException
{
	UnderageException()
	{
		super("You are under age");
	}
	
	UnderageException(String msg)
	{
		super(msg);
	}

}
