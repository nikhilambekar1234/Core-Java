import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class ThreadPool1 implements Runnable
{
	private String message;
	public ThreadPool1(String s)
	{
		this.message=s;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"(Start)message="+message);
		processmessage();  //call processmessage method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName()+"(End)"); //prints thread name
	}
	private void processmessage()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}