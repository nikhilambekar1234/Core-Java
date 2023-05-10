class A
{
	interface Message
	{
		void msg();
	}
}
class NestedInterface2 implements A.Message
{
	public void msg()
	{
		System.out.println("Hello");
	}
	public static void main(String arg[])
	{
		A.Message obj=new NestedInterface2();
		obj.msg();
	}
}