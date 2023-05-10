interface Parent
{
	
	void fun();
}
//interface Child1 implements Parent      //Note: Remember that interface cannot implement another interface only classes can do that!
interface Child1 extends Parent
{
	void gun();
}
class Child2 implements Child1
{
	public void fun()
	{
		System.out.println("i am fun");
	}
	public void gun()
	{
		System.out.println("i am gun");
	}
	public void run()
	{
		System.out.println("i am run");
	}
	public static void main(String arg[])
	{
		Child2 c2=new Child2();
		c2.fun();
		c2.gun();
		c2.run();
		System.out.println("--------------------------------------");
		Child1 c1=new Child2();
		c1.fun();  
		c1.gun();
	//	c1.run();   NOT ALLOWED
		System.out.println("--------------------------------------");
		Parent p=new Child2();
		p.fun();
	//	p.gun();    NOT ALLOWED
	//	p.run();     NOT ALLOWED
		System.out.println("--------------------------------------");
		
	}
}