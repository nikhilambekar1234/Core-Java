package FileHandling;
/*Java Exception Propagation
An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method.
 If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack. This is called exception propagation.
public class PropagatedException
Note: By default Unchecked Exceptions are forwarded in calling chain (propagated)
*/
class PropagatedException
{
    void m()
    {
    	int data=50/0;
    	System.out.println("data ="+data);
    }
    void n()
    {
    	m();
    }
    void p()
    {
    	try
    	{
    		n();
    	}
    	catch(Exception e)
    	{
    		System.out.println("exception handled");
    	}
    }
	public static void main(String[] args) 
	{
		PropagatedException obj=new PropagatedException();
		obj.p();
		System.out.println("normal flow");

	}

}
