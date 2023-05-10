//code that illustrates the activeCount() method
//import statement
import java.lang.*;
class GroupActiveCount extends Thread
{
	//constructor of the class
	GroupActiveCount(String tName,ThreadGroup tgrp)
	{
		super(tgrp,tName);
		start();
	}
	//overriding the run method
	public void run()
	{
		for(int j=0;j<1000;j++)
		{
			try
			{
				Thread.sleep(5);
			}
			catch(InterruptedException e)
			{
				System.out.println("The exception has been encountered "+e);
			}
		}
	}
}
public class GroupActiveCount1
{
	//main method
	public static void main(String arg[])
	{
		//creating the thread group
		ThreadGroup tg=new ThreadGroup("The parent group of thread");
		
		GroupActiveCount th1=new GroupActiveCount("first",tg);
		System.out.println("Starting the first");
		
		GroupActiveCount th2=new GroupActiveCount("second",tg);
		System.out.println("Starting the second");
		
		//checking the number of active thread by invoking the activeCount() method
		System.out.println("The total number of active threads are: "+tg.activeCount());
	}
}