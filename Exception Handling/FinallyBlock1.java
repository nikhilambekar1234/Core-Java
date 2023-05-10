package FileHandling;
/*Case 2: When an exception occurr but not handled by the catch block
Let's see the the fillowing example. Here, the code throws an exception however the catch block cannot handle it. 
Despite this, the finally block is executed after the try block and then the program terminates abnormally.
*/
public class FinallyBlock1 
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println("inside the try block");
			int data=25/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is always executed");
		}
        System.out.println("code end");

	}

}
