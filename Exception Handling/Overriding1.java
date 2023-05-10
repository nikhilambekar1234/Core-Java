package FileHandling;
class Parent
{
	void msg()
	{
		System.out.println("parent method");
	}
}
public class Overriding1 extends Parent
{
	 void msg()throws ArithmeticException     //unchecked
 //  void msg()throws IOException  //checked   //compile time error
   {
	   System.out.println("child method");
   }
	public static void main(String[] args) 
	{
		Parent p=new Overriding1();
		p.msg();

	}

}
