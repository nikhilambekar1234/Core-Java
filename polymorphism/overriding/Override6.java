//NOTE=>Invoking Overrident method from sub-class by super keaword
class Over6
{
	void fun()
	{
		System.out.println("parent fun method");
	}
	
}
class Override6 extends Over6
{
	@Override
    void fun()
	{
		super.fun();
		System.out.println("child fun method");
	}
	public static void main(String arg[])
	{
		Override6 obj=new Override6();
		                obj.fun();
	}
}