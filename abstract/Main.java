/*Create an abstract class pen with methods write () and refill () as abstract methods 
Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class and implements basicanimal interface
 with eat ( ) and sleep methods 
Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism 
Demonstrate polymorphism using using monkey  class from Q3 
Create an interface TVremote and use it to inherit another interface smart TVremote 
Create a class TV which implements TVremote interface from Q6*/
abstract class pen
{
	void run()
	{
		System.out.println("i am run");
	}
	abstract void write();
	abstract void refill();
}
class fountainpen extends pen
{
    void write()
	{
		System.out.println("i am writing");
	}
	void refill()
	{
		System.out.println("i am refilling");
	}
}
class Main
{
	public static void main(String arg[])
	{
		fountainpen a=new fountainpen();
	    a.write();
		a.run();
		System.out.println("-----------------------------------------");
      //pen b=new pen(); //abstract can not be instantiated
	  //b.run();
	    pen b=new fountainpen();  //REFERENCE OF ABSTRACT CLASS
	    b.run();
	    b.refill();
	}
	
}