/*NOTE=>Overriding and Abstract Method
RULE 2-If the supe-class overriden method does throws an exception, subclass overriding method can only throw same,subclass exception.
Throwing parent exception in Exception in Exception hierarchy will lead to compile time error.Also there is no issue
 if subclass overriden method is not throwing any exception
*/
class Over9
{
	void fun() throws RuntimeException
	{
		System.out.println("parent fun method");
	}
}
class Override9 extends Over9
{
	@Override
	//void fun() throws Exception                          // Exception  is a Parent Exception of RuntimeException (error)
	//void fun()                                                    // (run)
	//void fun() throws RuntimeException           //SAME exception (run)
     void fun() throws ArithmeticException     //ArithmeticException  is a child Exception of RuntimeException (run)
	{
		System.out.println("child fun method");
	}
	public static void main(String arg[])
	{
		Override9 obj=new Override9();
		                obj.fun();
	}
}