import java.lang.reflect.*;
class MethodCall1
{
	public static void main(String arg[])throws Exception
	{
		Class c=PrivateMethod1.class;
	    Object obj=c.newInstance();
	
	     Method m=c.getDeclaredMethod("cube",new Class[]{int.class});
     	m.setAccessible(true);
    	m.invoke(obj,4);
	}
	
}