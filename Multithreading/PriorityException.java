//importing the java.lang.package
import java.lang.*;
public class PriorityException extends Thread
{
	//the main method
	public static void main(String arg[])
	{
		//Now,priority of the main thread is set to 17,which is greater than 10
		Thread.currentThread().setPriority(17);
		//The currentThread is retrived using the currentThread() method 
		//displaying the main thread priority using the getPriority() method of the Thread class
		System.out.println("Priority of the main thread is : "+Thread.currentThread().getPriority());
		
	}
}