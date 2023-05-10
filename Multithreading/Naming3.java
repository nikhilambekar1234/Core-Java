class Naming3 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String arg[])
	{
		Naming3 t1=new Naming3();
		Naming3 t2=new Naming3();
		
		t1.start();
		t2.start();
	}
}