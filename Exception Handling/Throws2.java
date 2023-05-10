package FileHandling;
//Case 1: Handle Exception Using try-catch block
//Java throws clause which describes that checked exceptions can be propagated by throws keyword.
import java.io.*;
public class Throws2 
{
    void method()throws IOException
    {
    	System.out.println("before throw method");
    	throw new IOException("device error");
    	
    }
	public static void main(String[] args)
	{
		try
		{
			Throws2 obj=new Throws2();
			obj.method();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
		System.out.println("normal flow");

	}

}
