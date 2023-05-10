class Simple{}
class TestgetClass
{
	void printName(Object obj)
	{
		Class c=obj.getClass();
		System.out.println(c.getName());
	}
	public static void main(String arg[])
	{
		Simple s=new Simple();
		TestgetClass t=new TestgetClass();
		t.printName(s);
	}
}