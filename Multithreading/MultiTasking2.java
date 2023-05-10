class MultiTasking2 implements Runnable
{
	public void run()
	{
		System.out.println("task one");
	}
	public static void main(String arg[])
	{
		Thread t1=new Thread(new MultiTasking2() );  //passing annonymous object of TestMultitasking2 class
		
		Thread t2=new Thread(new MultiTasking2());
		
		t1.start();
		t2.start();
	}
}