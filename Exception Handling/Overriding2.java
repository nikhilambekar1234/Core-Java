package FileHandling;
/*Rule 1: If the superclass method declares an exception, subclass overridden method can declare
  the same subclass exception or no exception but cannot declare parent exception.
  Example in case subclass overridden method declares parent exception
 */
import java.io.*;
class Parent2
{
	void msg()throws ArithmeticException
	{
		System.out.println("parent method");
	}
}
public class Overriding2 extends Parent2
{

	  
	   void msg()throws Exception  //parent exception   //compile time error
	   {
		   System.out.println("child method");
	   }
		public static void main(String[] args) 
		{
			Parent2 p=new Overriding2();
			try
			{
				p.msg();
			}
			catch(Exception e)
			{
				
			}

		}


}
