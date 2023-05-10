package FileHandling;
//Note: By default, Checked Exceptions are not forwarded in calling chain (propagated)
public class PropagatedChecked
{
    void m()
    {
    	System.out.println("method m");
    	throw new java.io.IOException("device error");//checked
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
    		System.out.println("exception handeled");
    	}
    }
	public static void main(String[] args) 
	{
		PropagatedChecked obj=new PropagatedChecked();
		obj.p();
		System.out.println("normal flow");

	}

}
