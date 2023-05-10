interface hibrid1
{
	void fun();
}
interface hibrid2 extends hibrid1
{
	void gun();
}
interface hibrid3 
{
	void run();
}
class HibridInheritance  implements hibrid2,hibrid3
{
	void dun()
	{
		System.out.println("dun method");
	}
	@Override
	public void run()
	{
		System.out.println("run method");
	}
	@Override
	public void fun()
	{
		System.out.println("fun method");
	}
	@Override
	public void gun()
	{
		System.out.println("gun method");
	}
	public static void main(String arg[])
	{
		HibridInheritance obj=new HibridInheritance();
		                       obj.dun();
							   obj.gun();
							   obj.run();
							   obj.fun();
							   
	}
}