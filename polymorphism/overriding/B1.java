//Simple example of Covariant Return Type
class A
{  
	A get()
	{
		 System.out.println("get A1");
		 
	    return this;
	}  
}  
class B1 extends A
{  
	B1 get()
	{
		super.get();
	    System.out.println("get B1");
		System.out.println("return multiple");
	    return this;
	}  
	void message()
	{
	    System.out.println("welcome to covariant return type");
	}  
	public static void main(String args[])
	{  
	    new B1().get().message();
          //new B1().message();		
	}  
}  
