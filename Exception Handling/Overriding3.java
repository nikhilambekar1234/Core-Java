//package FileHandling;
//1-Example in case subclass overridden method declares subclass exception
//2-Example in case subclass overridden method declares same exception
//3-Example in case subclass overridden method declares no exception
class Parent3
{
	void msg()throws Exception
	{
		System.out.println("parent method");
	}
}
public class Overriding3 extends Parent3
{
	// void msg()throws ArithmeticException  //subclass exception
	void msg()throws Exception  //same exception   
	   // void msg()
	   {
		   System.out.println("child method");
		   throw new ArithmeticException(" msg except");
	   }
		public static void main(String[] args) 
		{
			Parent3 p=new Overriding3();
			try
			{
				p.msg();
			}
			catch(Exception e)
			{
				 System.out.println(e);
				 System.out.println("handle except");
			}

		}

}
