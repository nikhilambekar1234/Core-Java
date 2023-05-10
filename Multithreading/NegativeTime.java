import java.lang.Thread;
import java.io.*;
public class NegativeTime
{
	//main method
	 public static void main(String arg[])
	 {
		 //we can also use throws keyword followed by
		 //exception name for throwing the exception
		 try
		 {
			 for(int j=0;j<5;j++)
			 {
				 //it throws the exception IllegalArgumentException
				 //as the time is -ve which is -100
				 Thread.sleep(-100);
				 
				 //displaying the variables value
				 System.out.println(j);
			 }
		 }
		 catch(Exception e)
		 {
			 //the exception iscaught here
			 System.out.println(e);
		 }
	 }
}