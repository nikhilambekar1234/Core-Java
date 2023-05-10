/*As you can see in the above example, Printable and Showable interface have same methods but its implementation is provided by class TestTnterface1,
 so there is no ambiguity.
 Multiple inheritance is not supported through class in java but it is possible by interface, why?
As we have explained in the inheritance chapter, multiple inheritance is not supported in case of class. But it is supported in case of interface 
because there is no ambiguity as implementation is provided by the implementation class. For example:
What is marker or tagged interface?
An interface that have no member is known as marker or tagged interface. For example: Serializable, Cloneable, Remote etc. 
They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
1.	//How Serializable interface is written?  
2.	public interface Serializable
3.	{  
4.	}  

*/
interface Printable
{
	void print();
}
interface Showable
{
	void print();
}
class TestInterface1 implements Printable,Showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String arg[])
	{
		TestInterface1 obj=new TestInterface1();
		obj.print();
	}
}