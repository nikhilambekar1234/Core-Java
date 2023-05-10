/*Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class and implements basicanimal interface
 with eat ( ) and sleep methods */
class monkey
{
	void jump()
	{
		System.out.println("i am jumping");
	}
	void bite()
	{
		System.out.println("i am biting");
	}
}
interface basicanimal
{
	private void game()
	{
		System.out.println("i am gamming");
	}
	default void run()
	{
		game();
		System.out.println("i am running");
	}
	void eat();
	void sleep();
}
class human extends monkey implements basicanimal
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
}
class Main1
{
	public static void main(String arg[])
	{
		human a=new human();
	    a.jump();
		a.eat();
		a.run();
		System.out.println("----------------------------");
		monkey b=new human(); //REFERECE VARIABLE OF OTHER CLASS
		b.bite();       
		System.out.println("----------------------------");
		basicanimal c=new human(); //REFERECE VARIABLE OF INTERFACE
    	c.sleep(); 
		
	}
	
}