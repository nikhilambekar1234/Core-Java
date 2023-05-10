public class ShutDownHook
{
	//the msg class is derived from the thread class
	static class Msg extends Thread
	{
		public void run()
		{
			System.out.println("Bye");
		}
	}
	//main method
	public static void main(String arg[])
	{
		try
		{
			//creating an object of the class msg
			Msg ms=new Msg();
			
			//registering the msg object as the shutdown hook
			Runtime.getRuntime().addShutdownHook(ms);
			
			//printing the curent state of program
			System.out.println("the program is beginning");
			
			//causing the thread to sleep for 2 second
			System.out.println("waiting for 2 seconds");
			Thread.sleep(2000);
			
			//removing the hook
			Runtime.getRuntime().removeShutdownHook(ms);
			
			//printing the message program is terminating 
			System.out.println("The program is terminating");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}