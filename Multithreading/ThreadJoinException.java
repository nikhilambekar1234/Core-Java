class ABC extends Thread
{
	Thread threadToInterrupt;
	//overriding the run() method
	public void run()
	{
		//invoking the method interrupt
		threadToInterrupt.interrupt();
	}
}
public class ThreadJoinException
{
	//main method
	public static void main(String arg[])
	{
		try
		{
			//creating an object of the ABC
			ABC th1=new ABC();
			th1.threadToInterrupt=Thread.currentThread();
			th1.start();
			//invoking the join() method leads
			//to the generation of InterruptedException
			th1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("The exception has been caught: "+e);
		}
	}
}