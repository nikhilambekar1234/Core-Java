//Java program to illustrate preferring char[] arrays
//over strings for passwords in Java
public class Pass
{

	public static void main(String[] args)
	{

		String strPwd = "password";
		//char[] charPwd = new char[20] {'p','a','s','s','w','o','r','d'};
                                      char   charPwd[]=  {'p','a','s','s','w','o','r','d'};
		//char[]  charPwd="password".toCharArray();
		System.out.println("String password: " + strPwd );
		System.out.println("Character password: " + charPwd);
	}
}
