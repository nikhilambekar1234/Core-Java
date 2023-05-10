//NOTE=>final , static, private method can not override
class Over3
{
	//private void fun()                                    //  private method does not override
	//final void fun()                                      //  final method not override
	//static void fun()                                     //  statc method does not override
	void fun()
	{
		System.out.println("parent fun method");
	}
	
}
class Override3 extends Over3
{
	@Override
	 void fun()
	{
		System.out.println("child fun method");
	}
	
	public static void main(String arg[])
	{
		Override3 obj=new Override3();
		                obj.fun();
	}
}