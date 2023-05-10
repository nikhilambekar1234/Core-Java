class Outer1
{
	private int data=30;
	class Inner1
	{
		void msg()
		{
			System.out.println("data ="+data);
		}
	}
	public static void main(String arg[])
	{
		Outer1 out=new Outer1();
		Outer1.Inner1 in=out.new Inner1();
	    in.msg();
	}
}