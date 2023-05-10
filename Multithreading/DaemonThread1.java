class DaemonThread1 extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			//checking for daemon thread
			System.out.println("daemon thread work");
		}
		else
		{
			System.out.println("user thread work");
		}
	}
	public static void main(String arg[])
	{
		DaemonThread1 t1=new DaemonThread1(); //creating thread
		DaemonThread1 t2=new DaemonThread1();
		DaemonThread1 t3=new DaemonThread1();
		
		t1.setDaemon(true); //now t1 is daemon thread
		
		t1.start(); //starting thread;
		t2.start();
		t3.start();
	}
}