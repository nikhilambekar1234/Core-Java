class Simple{}
public class TestforName
{
	public static void main(String arg[])throws Exception
	{
		Class c=Class.forName("Simple");
		System.out.println(c.getName());
	}
}