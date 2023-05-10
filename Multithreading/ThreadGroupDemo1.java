public class ThreadGroupDemo1 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String arg[])
	{
		ThreadGroupDemo1 runnable=new ThreadGroupDemo1();
		ThreadGroup tg1=new ThreadGroup("parent threadgroup");
		
		Thread t1=new Thread(tg1,runnable,"one");
		t1.start();
		Thread t2=new Thread(tg1,runnable,"two");
		t2.start();
		Thread t3=new Thread(tg1,runnable,"three");
		t3.start();
		
		System.out.println("Thread Group Name: "+tg1.getName());
		tg1.list();
		
	}
}