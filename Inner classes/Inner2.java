interface Eatable
{
	void eat();
}
class Inner2
{
	public static void main(String arg[])
	{
		Eatable e=new Eatable()
		//annonymous class
		{
			public void eat()
			{
				System.out.println("nice fruits");
			}
		};
		e.eat();
	}
}