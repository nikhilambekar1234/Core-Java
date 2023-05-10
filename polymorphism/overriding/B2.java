//Simple example of Return Type
class A2
{  
	void get()
	{
	    System.out.println("get A2");
	}  
}  
class B2 extends A2
{  
   // void get()    //allowed
	int get()  //not allowed
	{
	    System.out.println("get B2");
	}  
	void message()
	{
	    System.out.println("welcome to covariant return type");
	}  
	public static void main(String args[])
	{  
	    new B2().get();
         new B2().message();		
	}  
}  
