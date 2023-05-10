class StaticNestedMethod
{
	static int data=30;
	static class Inner
	{
		static void msg()
		{
			System.out.println(data); 
		}
	}
	public static void main(String arg[])
	{
		StaticNestedMethod.Inner.msg(); // /no need to create the instance of static nested class  
	}
}