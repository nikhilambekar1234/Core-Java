/*//NOTE-1-static method belongs to the class , not to the object
//2-static method can be accessed directly by class name and does not need any object
//3-static method can access only static data it cannot access non static data(instance variable)
//4-static method can call only other static method and cannot call a non static method
//5-static method can not refer to "this" or "super" keyword in company
*/
class Method1
{
	static void show()
	{
		System.out.println("Static show method");
	}
}
//class StaticMethod1 extends Method1
class StaticMethod1
{
	static int a=10;
	         int b=20;
	static void data()
	{
	//	static int c=30;      //Error=Illegal start of expression
	             int d=40;
		System.out.println("Static data method");
		System.out.println("Static variable  a = "+a);
		System.out.println("Non-Static variable  d = "+d);
	//	System.out.println("Non-Static variable = "+b);    //non static method can not referenced from static constext
		
	}
    void print()
    {
	//	static int e=50;      //Error=Illegal start of expression
	             int f=60;
		System.out.println(" print method");
		System.out.println("Static variable  a = "+a);
		System.out.println("Non-Static variable  b = "+b);
		System.out.println("Non-Static variable  f = "+f);
	}	
	static void display()
	{
		System.out.println("Static display method");
	}
	void fun()
	{
		System.out.println("Non-Static fun method");
	}
	public static void main(String arg[])
	{
		data();
		System.out.println("----------------------------------------------");
		
		StaticMethod1 s1=new StaticMethod1();
		s1.print();
		System.out.println("----------------------------------------------");
		
		display();
		StaticMethod1.display();
		s1.display();
		System.out.println("----------------------------------------------");
		
		Method1 s2=new Method1();
	//	show();                 //Befor extends can not find //NOTE-After inherit access
		Method1.show();
		s2.show();
		System.out.println("----------------------------------------------");
		
	//	fun();     //non static method can not referenced from static constext
	//	StaticMethod1.fun();  //non static method can not referenced from static constext
		s1.fun();
		System.out.println("----------------------------------------------");
		
	}
}