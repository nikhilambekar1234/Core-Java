class RUNNABLE1 implements Runnable
{
	public void run()
	{
		System.out.println("thread is running");
	}
	public static void main(String arg[])
	{
		RUNNABLE1 m1=new RUNNABLE1();
		Thread t1=new Thread(m1);  //using the constructor Thread(Runnable r)
		t1.start();
	}
}
