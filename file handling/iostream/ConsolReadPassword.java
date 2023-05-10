/*Java Console class
The Java Console class is be used to get input from console. It provides methods to read text and password.
If you read password using Console class, it will not be displayed to the user.
The java.io.Console class is attached with system console internally. The Console class is introduced since 1.5.
*/
import java.io.*;
class ConsolReadPassword
{
	public static void main(String arg[])
	{
		Console c=System.console();
		System.out.println("Enter password");
		char[] ch=c.readPassword();
		String pass=String.valueOf(ch);    //converting char array into string
		System.out.println("Password is :"+pass);
	}
}