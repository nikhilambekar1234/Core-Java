package FileHandling;
/*Case 3: When an exception occurs and is handled by the catch block
Example: see the following example where the Java code throws an exception and the catch block handles the exception. 
Later the finally block is executed after the try-catch block. Further, the rest of the code is also executed normally.
*/
public class FinallyBlock2 
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("inside the try block");
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handle");
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is always executed");
		}
        System.out.println("code end");
	}
}
