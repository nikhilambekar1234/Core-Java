class CallByRun2 extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
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
		CallByRun2 t1=new CallByRun2();
		CallByRun2 t2=new CallByRun2();
		
		t1.run();
		t2.run();
		System.out.println("By start method--------------------");
		t1.start();
		t2.start();
	}
}