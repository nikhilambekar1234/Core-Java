//important import statements
import java.lang.Thread;
import java.io.*;
public class SleepMainMethod2
{
	//main method
	public static void main(String arg[])
	{
		try
		{
			for(int j=0;j<5;j++)
			{
				//the main thread sleeps for the 1000 milliseconds, which is 1sec
				//whenever the loop runs
				Thread.sleep(1000);
				
				//displaying the value of the  variable
				System.out.println(j);
				
			}
		}
		catch(Exception e)
		{
			//catching the exception
			System.out.println(e);
		}
	}
}
