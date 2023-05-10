import java.lang.reflect.Method;
public class MethodCall
{
	public static void main(String arg[])throws Exception
	{
		Class c=Class.forName("PrivateMethod");
		Object o=c.newInstance();
		Method m=c.getDeclaredMethod("message",null);
		m.setAccessible(true);
		m.invoke(o,null);
	}
}