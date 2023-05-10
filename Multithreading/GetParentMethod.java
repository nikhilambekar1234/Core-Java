//code illustrating the getParent() method
//import statement
import java.lang.*;
class ParentMethod extends Thread
{
	//constructor of the class
	ParentMethod(String tName,ThreadGroup tgrp)
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
				System.out.println("The exception has been encountered "+e);
			}
		}
		System.out.println(Thread.currentThread().getName()+"thread has finished executing");
	}
}
public class GetParentMethod
{
			//main method
			public static void main(String arg[])throws SecurityException,InterruptedException
			{
				//creating the thread group
				ThreadGroup tg=new ThreadGroup("The parent group");
				ThreadGroup tg1=new ThreadGroup(tg,"The child group");
				
				ParentMethod th1=new ParentMethod("the first ",tg);
				System.out.println("Starting the first");
				
				ParentMethod th2=new ParentMethod("the second ",tg);
				System.out.println("Starting the second");
				
				//printing the parent ThreadGroup of both child and parent threads
				System.out.println("The ParentThreadGroup for "+tg.getName() +" is "+tg.getParent().getName());
				System.out.println("The ParentThreadGroup for "+tg1.getName() +" is "+tg1.getParent().getName());
				
			}
		
	
}