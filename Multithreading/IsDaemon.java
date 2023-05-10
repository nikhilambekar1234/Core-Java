//code illustrating the isDaemon() method 
//import statement
import java.lang.*;
class Daemon extends Thread
{
	//constructor of the class
	Daemon(String tName,ThreadGroup tgrp)
	{
		super(tgrp,tName);
		start();
	}
	//overrding the run() method
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
				System.out.println("The exception has been encountered"+e );
			}
		}
		System.out.println(Thread.currentThread().getName()+"thread has finished executing");
		
	}
}
public class IsDaemon
{
	//main method
	public static void main(String arg[])throws SecurityException,InterruptedException
	{
		//creating the  thread group
		ThreadGroup tg=new ThreadGroup("the parent group");
		
		Daemon th1=new Daemon("the first",tg);
		System.out.println("Starting the first");
		
		Daemon th2=new Daemon("the second",tg);
		System.out.println("Starting the second");
		
		if(tg.isDaemon()==true)
		{
			System.out.println("The group is a daemon group");
		}
		else
		{
			System.out.println("The group is not a daemon group");
		}
		
	}
}