package FileHandling;

public class Throws6 
{
	//static void method()
    static void method()throws ArithmeticException
    {
    	System.out.println("Inside the method");
    	throw new ArithmeticException("throwing ArithmeticException");
    }
	public static void main(String[] args) 
	{
	    try
	    {
	    	method();
	    }
	    catch(ArithmeticException e)
	    {
	    	System.out.println("caught in main method");
	    }

	}

}
