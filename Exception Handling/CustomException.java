package FileHandling;
/*Consider the example 1 in which InvalidAgeException class extends the Exception class.
Using the custom exception, we can have your own exception and message. Here, we have passed a string to the constructor of superclass
 i.e. Exception class that can be obtained using getMessage() method on the object we have created.
 */
import java.util.Scanner;
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		//calling the constructor of parent Exception
		super(str);
	}
}
//class that uses custom exception InvalidAgeException
public class CustomException
{
	public static void validate(int age)throws InvalidAgeException
	{
	
		if(age<=18)
		{
			System.out.println("First statement");
			//throw an object of user defined exception
			throw new InvalidAgeException("person is not eligible to vote");
			
		}
		else
		{
			System.out.println("person is eligible to vote");
		}
	}
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter your age");
			int age=sc.nextInt();
			validate(age);
		}
		catch(InvalidAgeException ex)
		{
			System.out.println("caught the exception");
			//printing the message from InvalidAgeException
			System.out.println("Exception occured="+ex);
		}
		System.out.println("END CODE");
		
	}
}
