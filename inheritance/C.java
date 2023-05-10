//CONSTRUCTOR IN  INHERITANCE
class A
{
	A()
	{
		System.out.println("A");
	}
	A(int x)
	{
		System.out.println(x);
	}
}
class B extends  A
{
	B()
	{
		//super(12);
		System.out.println("B");
	}
	
}
class C 
{
	
	public static void main(String arg[])
	{
		B a=new B();
	}
}