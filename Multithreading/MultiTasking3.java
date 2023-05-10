class Tasking3 extends Thread
{
	public void run()
	{
		System.out.println("task one");
	}
}
class Tasking4 extends Thread
{
	public void run()
	{
		System.out.println("task two");
	}
}
public class MultiTasking3
{
	public static void main(String arg[])
	{
		Tasking3 t1=new Tasking3();
		Tasking4 t2=new Tasking4();
		
		t1.start();
		t2.start();
	}
}