/*NOTE=>1-IF WE CREATE ANY FINAL VARIABLE, IT BECOMES CONSTANT, WE CANNOT CHANGE THE VALUE OF FINAL VARIABLE
2-IF WE CREATE ANY FINAL METHOD, WE CANNOT OVERRIDE IT
3-IF WE CREATE ANY FINAL CLASS,WE CANNOT EXTEND IT OR INHERIT IT
BUT class extends or inherit in Final class
*/
//class Class                        //RUN
 final class Class                 //ERROR-can not inherit from final class
{
	void fun()
	{
		System.out.println("fun method");
	}
}
//final class ClassFinal extends Class
class ClassFinal extends Class
{
	void gun()
	{
		System.out.println("gun method");
	}
	public static void main(String arg[])
	{
		ClassFinal obj=new ClassFinal();
		obj.fun();
		obj.gun();
	}
}