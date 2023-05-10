interface A3
{
	void msg(Message3 ref);
	class Message3
	{
		int id=1;
		String name="nik";
	}
}
class NestedInterface3 implements A3
{
	public void msg(Message3 ref)
	{
		//System.out.println("HELLO");
		System.out.println(ref.id+"  "+ref.name);
	}
	public static void main(String arg[])
	{
		
		NestedInterface3 obj=new NestedInterface3();
		obj.msg(new A3.Message3());
		  
	}
}