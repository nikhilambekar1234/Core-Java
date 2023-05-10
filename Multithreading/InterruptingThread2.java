class InterruptingThread2 extends Thread
{
	public void run()
	{
		try
		{
                                         for(int i=1;i<=3;i++)
                                        {
                                                Thread.sleep(1000);
			System.out.println("task");
                                        }
			
		}
		catch(InterruptedException e)
		{
			System.out.println("exception handled "+e);
		}
		System.out.println("Thread is running");
	}
	public static void main(String arg[])
	{
		InterruptingThread2 t1=new InterruptingThread2();
		t1.start();
		t1.interrupt();
	}
}