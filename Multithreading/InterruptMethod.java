//Code illustrating the interrupt() method
//import statement
import java.lang.*;
class Interrupt1 extends Thread
{
	//constructor of the class
	Interrupt1(String tName,ThreadGroup tgrp)
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
				System.out.println("The exeception has been encountered"+e);
			}
		}
		System.out.println(Thread.currentThread().getName() +"thread has finished executing");
	}
}
public class InterruptMethod
{
	//main method 
	public static void main(String arg[])throws SecurityException,InterruptedException
	{
		ThreadGroup tg=new ThreadGroup("The parent group");
		ThreadGroup tg1=new ThreadGroup(tg,"The child group");
		
		Interrupt1 th1=new Interrupt1("the first",tg);
		System.out.println("Starting the first");
		
		Interrupt1 th2=new Interrupt1("the second",tg);
		System.out.println("Starting the second");
		
		//invoking the interrupt method
		tg.interrupt();
	}
}