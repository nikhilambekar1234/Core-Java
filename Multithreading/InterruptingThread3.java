class InterruptingThread3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String arg[])
		{
			InterruptingThread3 t1=new InterruptingThread3();
			t1.start();
			t1.interrupt();
		}
}