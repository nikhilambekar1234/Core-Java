//NOTE=>final , static, private method can not override
class Over5
{
	void fun()
	{
		System.out.println("parent fun method");
	}
	
}
class Override5 extends Over5
{
	@Override
	//private void fun()                       //can not override
	//final void fun()                        //run
	//static void fun()                      //can not override
	 void fun()
	{
		System.out.println("child fun method");
	}
	
	public static void main(String arg[])
	{
		Override5 obj=new Override5();
		                obj.fun();
	}
}