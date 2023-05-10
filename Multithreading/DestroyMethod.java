//code illustrting the destroy() method
//import statement
import java.lang.*;
class destroy1 extends Thread
{
	//constructor of the class
	destroy1(String tName,ThreadGroup tgrp)
	{
		super(tgrp ,tName);
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
				System.out.println("The exception has been encountered "+e);
			}
		}
		System.out.println(Thread.currentThread().getName()+"thread has finished executing");
		
	}
}
public class DestroyMethod
{
	//main method
	public static void main(String arg[])throws SecurityException,InterruptedException
	{
		//creating the thread group
		ThreadGroup tg=new ThreadGroup("The parent group");
		ThreadGroup tg1=new ThreadGroup(tg,"The child group");
		
		destroy1 th1=new destroy1("the first",tg);
		System.out.println("Starting the first");
		
		destroy1 th2=new destroy1("the second",tg);
		System.out.println("Starting the second");
		
		//waiting until the other threads has been finished
		th1.join();
		th2.join();
		
		//destroying the child thread group
		tg1.destroy();
		System.out.println(tg1.getName()+"is destroyed");
		
		//destroying the parent thread group
		tg.destroy();
		System.out.println(tg.getName()+"is destroyed");
		
	}
}