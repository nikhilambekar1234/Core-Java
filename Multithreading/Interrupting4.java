class Interrupting4 extends Thread
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			if(Thread.interrupted())
			{
				System.out.println("code for interrupted thread");
			}
			else
			{
				System.out.println("code for normal thread");
			}
		}   //end of loop
	}
	public static  void main(String arg[])
	{
		Interrupting4 t1=new Interrupting4();
		Interrupting4 t2=new Interrupting4();
		
		t1.start();
		t1.interrupt();
		
		t2.start();
	}
}