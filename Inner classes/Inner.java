abstract class Person
{
	abstract void eat();
}
class Inner
{
	public static void main(String arg[])
	{
		Person p=new Person()
		//annonymous class
		{
			void eat()
		    {
		    	System.out.println("nice fruits");
		    }
	    };
		p.eat();
	}
}