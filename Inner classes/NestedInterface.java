interface Showable
{
	void show();
	interface Message
	{
		void msg();
	}
}
class NestedInterface implements Showable,Showable.Message
{
	public void show()
	{
		System.out.println("hi");
	}
	public void msg()
	{
		System.out.println("Hello");
	}
	
	public static void main(String arg[])
	{
	   Showable.Message obj=new NestedInterface();  //upcasting 
		obj.msg();
		Showable obj1=new NestedInterface();
		obj1.show();
	}
}