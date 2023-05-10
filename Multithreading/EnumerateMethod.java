//code illustrating the enumerate() method
//import statement
import java.lang.*;
class Enumerate extends Thread
{
	//constructor of  the class
	Enumerate(String tName,ThreadGroup tgrp)
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
				System.out.println("The exception has been encountered"+e);
			}
		}
		System.out.println(Thread.currentThread().getName()+"thread has finished executing");
		
	}
}
public class EnumerateMethod
{
	//main method
	public static void main(String arg[])throws SecurityException,InterruptedException
	{
		//creating the thread group
		ThreadGroup tg=new ThreadGroup("The parent group");
		ThreadGroup tg1=new ThreadGroup(tg,"child group");
		
		Enumerate th1=new Enumerate("the first",tg);
		System.out.println("Starting the first");
		
		Enumerate th2=new Enumerate("the second",tg);
		System.out.println("Starting the second");
		
		//returning the nubmer of threads kept in this array
		Thread[] grp=new Thread[tg.activeCount()];
		int cnt=tg.enumerate(grp);
		for(int j=0;j<cnt;j++)
		{
			System.out.println("Thread "+grp[j].getName()+ "is found" );
		}
	}
}