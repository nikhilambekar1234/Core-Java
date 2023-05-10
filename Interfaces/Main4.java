/*Create an interface TVremote and use it to inherit another interface smart TVremote 
Create a class TV which implements TVremote interface from Q6*/
interface TVremote
{
	void jump();
	void bite();
}
interface smarttvremote extends TVremote
{
	void eat();
	void sleep();
}
class TV  implements smarttvremote
{
    @Override
	public void eat()
	{
		System.out.println("i am eating");
	}
	@Override
	public void sleep()
	{
		System.out.println("i am sleeping");
	}
	@Override
	public void jump()
	{
		System.out.println("i am jumping");
	}
	@Override
	public void bite()
	{
		System.out.println("i am biting");
	}
}
class Main4
{
	public static void main(String arg[])
	{
		TV a=new TV();
		a.jump();
		a.eat();
		System.out.println("------------------------------");
	   smarttvremote b=new TV();
		b.jump();
		b.eat();
	}
}

