class CallByRun1
{
	public void run()
	{
		System.out.println("running");
	}
	public static void main(String arg[])
	{
		CallByRun1 t1=new CallByRun1();
		t1.run();  //fine,but does not start a separate call stack
	}
}
