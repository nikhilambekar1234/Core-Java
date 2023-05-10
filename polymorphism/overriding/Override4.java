//NOTE=>synchronized,strictfp method
class Over4
{
	  // strictfp void fun()
     synchronized void fun()                                     //override
	{
		System.out.println("parent fun method");
	}
	
}
class Override4 extends Over4
{
	@Override
	//synchronized void fun()                                   //run
	 void fun()  
	{
		System.out.println("child fun method");
	}
	
	public static void main(String arg[])
	{
		Override4 obj=new Override4();
		                obj.fun();
	}
}