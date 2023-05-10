import java.lang.instrument.*;
class Test
{
	public static void main(String arg[])
	{
		System.out.println("main.........");
	}
	public static void premain(String s,Instrumentation i)
	{
		System.out.println("premain.........");
		System.out.println(i.getObjectSize(new A()));
	}
}