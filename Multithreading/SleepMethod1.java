class SleepMethod1 extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			//the thread will sleep  for the 2000 milli seconds
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String arg[])
	{
		SleepMethod1 t1=new SleepMethod1();
		SleepMethod1 t2=new SleepMethod1();
		
		t1.start();
		t2.start();
	}
}