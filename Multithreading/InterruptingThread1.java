class InterruptingThread1 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			System.out.println("task");
		}
		catch(InterruptedException e)
		{
			throw new RuntimeException("Thread interrupted  "+e);
		}
	}
	public static void main(String arg[])
	{
		InterruptingThread1 t1=new InterruptingThread1();
		t1.start();
		try
		{
			t1.interrupt();
			
		}
		catch(Exception e)
		{
			System.out.println("exception handled "+e);
		}
	}
}