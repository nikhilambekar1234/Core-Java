/*Methods of Console class
Let's see the commonly used methods of Console class.
How to get the object of Console
System class provides a static method console() that returns the unique instance of Console class.
1.	public static Console console(){}  
Let's see the code to get the instance of Console class.
1.	Console c=System.console();  
*/
import java.io.*;
class ConsoleRead
{
	public static void main(String arg[])
	{
		Console c=System.console();
		System.out.println("Enter your name");
		String n=c.readLine();
		System.out.println("welcome "+n);
	}
}