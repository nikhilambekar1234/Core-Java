package FileHandling;
class UserDefinedException extends Exception
{
	public UserDefinedException(String str)
	{
		super(str);  //calling constructor of parent exception
	}
}
public class Throw3
{

	public static void main(String[] args)
	{
		try
		{
			//throw an object of user defined exception
			throw new UserDefinedException("This is user-defined exception");
			
		}
		catch(UserDefinedException ude)
		{
			System.out.println("Caught the exception");
			System.out.println(ude.getMessage());
		}

	}

}
