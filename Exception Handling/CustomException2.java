package FileHandling;
class MyCustomException extends Exception
{
	
}
//class that uses custom exception MyCustomException
public class CustomException2 
{
      //main method
	 public static void main(String arg[])
	 {
		 try
		 {
			 //throw an object of user defined exception
			 throw new MyCustomException();
		 }
		 catch(MyCustomException ex)
		 {
			 System.out.println("Caught the exception");
			 System.out.println(ex.getMessage());
		 }
		 System.out.println("Code End");
	 }
}
