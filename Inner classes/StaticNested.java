class StaticNested
{
	static int data=30;
	static class Inner
	{
		 void print()
		{
			System.out.println(data);
		}
	}
	public static void main(String arg[])
	{
		StaticNested.Inner obj=new StaticNested.Inner();
		obj.print();
	}
}
