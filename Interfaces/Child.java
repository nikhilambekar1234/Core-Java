//DEFAULT METHOD
interface Parent
{
	 //static void fun()
      private void fun()
	{
		System.out.println("I am fun");
	}
	default void run()
	{
		fun();
		System.out.println("I am default run");
	}
	
	void gun();
}
class Child implements Parent
{
	@Override
	public void gun()
	{
		System.out.println("I am Gun");
	}
	@Override
	public void run()
	{
		System.out.println("I am Override run");
	}
	
	public static void main(String arg[])
	{
		Child c=new Child();
		c.run();
		c.gun();
		//c.fun();     not allowed
		System.out.println("................................................................");
	   Parent p=new Child();
	   p.run();    // call to pubic void run
	  // fun();//not call static
	   Parent. fun();//call static
	    // p.fun();  // not to call staic method
		System.out.println("................................................................");
		//p.fun(); //not access private fun
		
	}
}