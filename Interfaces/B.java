//INTERFACES
interface C
{
	int avg=50;
	
	 void run();    // no body in interface
}
class A
{
	int num=10;
}
//class B  implements C
class B extends A implements C
{
	//int avg=150;//chanded value
	//void run()   // error WEAKER ACCESS PRIVILAGE 
	public void run()
	{
		System.out.println("I am run");
	}
	public static void main(String arg[])
	{
		B b=new B();
		b.num=20;
		System.out.println(b.num);  //20
		//b.avg=100;            //error You cannot modify the properties in Interfaces as they are final
		System.out.println(b.avg);  //50  or  chanded 150
		b.run();
	//	C b=new C();   C is abstract can not be instantiated
	
	}
}


























