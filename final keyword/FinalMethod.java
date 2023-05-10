/*NOTE=>1-IF WE CREATE ANY FINAL VARIABLE, IT BECOMES CONSTANT, WE CANNOT CHANGE THE VALUE OF FINAL VARIABLE
2-IF WE CREATE ANY FINAL METHOD, WE CANNOT OVERRIDE IT
3-IF WE CREATE ANY FINAL CLASS,WE CANNOT EXTEND IT OR INHERIT IT
*/
class Method
{
	  final void fun()                                    //final method can not overrides
	//   void fun()
	//final void fun()                                   //final method can not override
	{
		System.out.println("fun method in Parent class");
	}
}
class FinalMethod extends Method
{
	 
	@Override
	    void fun()                                                                      
	// final void fun()                                                               //run final method 
	//final void fun()                                                             
    {
	   	System.out.println("fun method in Child class");
    }
	
	public static void main(String arg[])
	{
		 FinalMethod obj=new FinalMethod();
		 obj.fun();
		 
	}
}
