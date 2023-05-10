class Simple{}
interface My{}
class ObjectClass
{
	public static void main(String arg[])
	{
		try
		{
			Class c=Class.forName("Simple");
			System.out.println(c.isInterface());
			
			Class c2=Class.forName("My");
			System.out.println(c2.isInterface());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}