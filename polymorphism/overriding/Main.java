//DYNAMIC METHOD DISPATCH
class Parent
{
	void sing()
	{
		System.out.println("parent sing");
	}
	void play()
	{
		System.out.println("parent play");
	}
}
class Child extends Parent
{
	void eat()
	{
		System.out.println("child eat");
	}
	void play()
	{
		System.out.println("child play");
	}
}
class Main
{
	public static void main(String arg[])
	{
	  //Child c=new Parent(); not allowed
	    Parent c=new Child();
	  //c.eat();//not allowed
	    c.sing();
        c.play();
	}
}