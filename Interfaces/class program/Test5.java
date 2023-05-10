interface A
{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements A
{
	public void c()
	{
		System.out.println("i am c");
	}
}
class M extends B 
{
	public void a()
	{
		System.out.println("i  am a");
	}
	public void b()
	{
		System.out.println("i  am b");
	}
	public void d()
	{
		System.out.println("i  am d");
	}
}
class Test5
{
	public static void main(String arg[])
	{
		A a=new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}