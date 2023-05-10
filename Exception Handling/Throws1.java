package FileHandling;
/*Rule: If we are calling a method that declares an exception, we must either caught or declare the exception.
 */
import java.io.IOException;
public class Throws1
{
	void m()throws IOException
    {
    	System.out.println("before throw m");
    	throw new IOException("device error");//checked
    }
    void n()throws IOException
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
    		System.out.println("exception handeled by throws");
    	}
    }
	public static void main(String[] args) 
	{
		Throws1 obj=new Throws1();
		obj.p();
		System.out.println("normal flow");

	}
	

	

}
