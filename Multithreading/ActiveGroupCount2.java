//java code illustrating the activeGroupCount() method
//import statement
import java.lang.*;
class GroupCount extends Thread
{
	//constructor of the class
	GroupCount(String tName,ThreadGroup tgrp)
	{
		super(tgrp,tName);
		start();
	}
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
				System.out.println("The exception has been encountered "+e);
			}
		}
		System.out.println(Thread.currentThread().getName()+"thread has finished executing");
	}
}
public class ActiveGroupCount2
{
	//main method
	public static void main(String arg[])
	{
		//creating the thread group
		ThreadGroup tg=new ThreadGroup("The parent group of thread");
		ThreadGroup tg1=new ThreadGroup(tg,"The chile group");
		
		GroupCount th1=new GroupCount("the first",tg);
		System.out.println("starting the first");
		
		GroupCount th2=new GroupCount("the first",tg);
		System.out.println("starting the second");
		
		//checking the number of active thread by invoking  the activeGroupCount() method
		System.out.println("The total number of active thread groups are :"+tg.activeGroupCount());
	}
}