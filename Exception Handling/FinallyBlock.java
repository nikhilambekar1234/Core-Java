package FileHandling;
/*Java finally block
Java finally block is a block used to execute important code such as closing the connection, etc.
Java finally block is always executed whether an exception is handled or not. Therefore, 
it contains all the necessary statements that need to be printed regardless of the exception occurs or not.
Case 1: When an exception does not occur
Let's see the below example where the Java program does not throw any exception, and the finally block is executed after the try block.
*/
public class FinallyBlock
{

	public static void main(String[] args) 
	{
		try
		{
			int data=25/5;
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
