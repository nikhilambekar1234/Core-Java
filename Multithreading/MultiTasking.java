class MultiTasking extends Thread
{
	public void run()
	{
		System.out.println("task one");
	}
	public static void main(String arg[])
	{
		MultiTasking t1=new MultiTasking();
		MultiTasking t2=new MultiTasking();
		MultiTasking t3=new MultiTasking();
		
		t1.start();
		t2.start();
		t3.start();
	}
}