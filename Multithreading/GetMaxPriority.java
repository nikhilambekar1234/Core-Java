//code illustratin the getMaxPriority() method
//import statement
import java.lang.*;
class GetMax extends Thread
{
	//constructor of the class
	GetMax(String tName,ThreadGroup tgrp)
	{
		super(tgrp,tName);
		start();
	}
	//overriding the run() method
	public void run()
	{
		for(int j=0;j<100;j++)
		{
			try
			{
				Thread.sleep(5);
			}
			catch(InterruptedException e)
			{
				System.out.println("the exception has been encountered "+e);
			}
		}
		System.out.println(Thread.currentThread().getName()+"thread has finished executing");
		
	}
}
public class GetMaxPriority
{
	//main method
	public static void main(String arg[])throws SecurityException,InterruptedException
	{
		//creating the thread group
		ThreadGroup tg=new ThreadGroup("The parent group");
		ThreadGroup tg1=new ThreadGroup(tg,"the child group");
		
		GetMax th1=new GetMax("the first",tg);
		System.out.println("Starting the first");
		
		GetMax th2=new GetMax("the second",tg);
		System.out.println("Starting the second");
		
		int priority=tg.getMaxPriority();
		System.out.println("The maximum priority of the parent ThreadGroup: "+priority);
	}
}