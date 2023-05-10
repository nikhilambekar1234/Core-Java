//code illustrating the isDestroyed() method
//import statement
import java.lang.*;
class Destroyed extends Thread
{
	//constructor of the class
	Destroyed(String tName,ThreadGroup tgrp)
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
public class IsDestroyed
{
	//main method
	public static void main(String arg[])throws SecurityException,InterruptedException
	{
		     //creating the thread group
	         ThreadGroup tg=new ThreadGroup("the parent group");
	         ThreadGroup tg1=new ThreadGroup(tg,"the child group");
	
	          Destroyed th1=new Destroyed("the first",tg);
	          System.out.println("Starting the first");
	
	          Destroyed th2=new Destroyed("the second",tg);
	          System.out.println("Starting the second");
	
	           if(tg.isDestroyed()==true)
	          {
	                  	System.out.println("The group has been destroyed");
	          }
	          else
	          {
		           	System.out.println("The group has not been destroyed");
            	}
	}
	
	
}