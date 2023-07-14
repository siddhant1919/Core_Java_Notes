package ExceptionHandling;

public class Demo1 {

	public static void main(String[] args) 
	{
		int age = 16;
		
//		if(age<18)
//		{
//			throw new UnderageException("You are not eligible to vote");
//		}
//		
//		System.out.println("hi");
		
		try 
		{
			
			if(age<18)
			{
				throw new UnderageException("You are not eligible to vote");
			}
		}
		
		catch(UnderageException e)
		{
			e.printStackTrace();
		}
		System.out.println("hi");

	}

}
