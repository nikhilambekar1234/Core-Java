/*NOTE=>Overriding and Abstract Method
RULE 1-If the super-class overriden method does not throws an exception,subclass overriding method can only throws the unchecked exception,
throwing checked exception will lead to compile-time error
*/
class Over8
{
	void fun()
	{
		System.out.println("parent fun method");
	}
}
class Override8 extends Over8
{
	@Override
	//void fun() throws Exception                      //Checked Exception not throws (error)
    void fun() throws ArithmeticException     //Unchecked Exception throws
	{
		System.out.println("child fun method");
	}
	public static void main(String arg[])
	{
		Override8 obj=new Override8();
		                obj.fun();
	}
}