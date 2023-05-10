class Hook extends Thread
{
	public void run()
	{
		System.out.println("shut down hook task completed");
	}
}
public class ShutDown
{
	public static void main(String arg[])throws Exception
	{
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new Hook());
		System.out.println("Now main sleeping  press ctrl+c to exit");
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
	}
}

