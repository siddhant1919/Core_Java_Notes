package ExceptionHandling;

public class Demo {
	
//	int a = 100, b = 2, c;
	
	int divide(int a, int b) throws ArithmeticException
	{
		
		return a / b;
	}

	public static void main(String[] args) 
	{
		Demo d = new Demo();		
		int a = 100, b = 2, c = 0;
		try {
			c = d.divide(a,b);
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		finally{
			System.out.println("in finally block");
		}
		
		System.out.print(c);

	}

}
