/*NOTE=>Overriding and Abstract Method
Always abstract method present in  abstract class
but in abstract class  not necessity to put abstract method; mean without abstract method ,run abstract class
Abstract method in an interface or abstract class are meant to be overriden in derived concrete classes otherwise compile-time error will be thrown
*/
interface Ove7
{
	void gun();
}
abstract class Over7
{
	abstract void fun();
}
class Override7 extends Over7 implements Ove7
{
	@Override
    void fun()
	{
		System.out.println("abstract fun method");
	}
	@Override
    public void gun()                                                        // for interface always public method
	{
		System.out.println("interface abstract gun method");
	}
	public static void main(String arg[])
	{
		Override7 obj=new Override7();
		                obj.fun();
						obj.gun();
	}
}