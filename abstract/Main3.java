//Create a class telephone with  lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism 
/*abstract class phone  //ABSTRACT CLASS NOT NECECESSITY OF ABSTRACT METHOD 
{
	void sing()
	{
		System.out.println("i am singing");
	}
}*/
//class Telephone  //      CLASS SHOULD BE ABSTRACT IF ABSTRACT MEHOD INCLUDE
abstract class Telephone  
{
	int num=10;
	abstract void lift();
	abstract void disconnected();
}
class smartphone extends Telephone
{
	@Override
    void lift()
	{
		System.out.println("i am lifting");
	}
	@Override
	void disconnected()
	{
		System.out.println("i am disconnected");
	}
}
class Main3
{
	public static void main(String arg[])
	{
		smartphone a=new smartphone();
	    a.lift();
		System.out.println(a.num);
		System.out.println("-----------------------------------------");
     
	  Telephone b=new smartphone();  //REFERENCE OF OTHER CLASS
	    b.disconnected();
		b.num=50;
	    System.out.println(b.num);
	}
	
}