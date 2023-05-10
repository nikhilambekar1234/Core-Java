public class ThreadTwice extends Thread
{
	
	
	public void run()
	{
		System.out.println("running");
	}
	public static void main(String arg[])
	{
		ThreadTwice t1=new ThreadTwice();
		t1.start();
	    t1.start();
	}
}