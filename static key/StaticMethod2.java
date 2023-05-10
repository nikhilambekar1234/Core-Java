//NOTE=>    4-STATIC METHOD CAN CALL ONLY OTHER STATIC METHOD AND CANNOT CALL A NON STATIC METHOD
//NOTE=>   BUT NON-STATIC METHOD CAN CALL OTHER STATIC METHOD AND SNON STATIC METHOD
class StaticMethod2
{   
   static  void dun()
	{
		System.out.println("Static dun method");
	}
     void run()
	{
		dun();
		System.out.println("Non-Static run method");
	}
	static void fun()
	{
	//	run();               //non-static method cannot be referenced from static context
		System.out.println("Static fun method");
	}
    static void gun()
	{
		fun();                             //4-static method can call only other static method and cannot call a non static method
		System.out.println("Static gun method");
	}
	public static void main(String arg[])  
	{
		gun();
		StaticMethod2 obj=new StaticMethod2();
		obj.run();
	}
	
}