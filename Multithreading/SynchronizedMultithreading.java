//A sender class
class Sender
{
	public void SenderMsg(String msg)
	{
		System.out.println("\nSending a Message: "+msg);
		try
		{
			Thread.sleep(800);
		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted");
		}
		System.out.println("\n"+msg+"sent");
	}
}
//A sender class for sending a message using threads
class SenderWThreads extends Thread
{
	private String msg;
	Sender sd;
	
	//Receiver method to receive a message object and a message to be sent
	SenderWThreads(String m,Sender obj)
	{
		msg=m;
		sd=obj;
	}
	public void run()
	{
		//Checks that only one threads sends a message at a time
		synchronized(sd)
		{
			//synchronizing the sender object
			sd.SenderMsg(msg);
		}
	}
}
//Driver code
public class SynchronizedMultithreading
{
	public static void main(String arg[])
	{
		Sender sender=new Sender();
		SenderWThreads sender1=new SenderWThreads("Hola",sender);
		
		SenderWThreads sender2 =  new SenderWThreads( "Welcome to Javatpoint website ", sender);
		
		//start two threads of SenderWThreads type
		sender1.start();
		sender2.start();
		
		//wait for threads to end
		try
		{
			sender1.join();
			sender2.join();
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
	}
}