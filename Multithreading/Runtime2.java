public class Runtime2
{
	public static void main(String arg[])throws Exception
	{
	   //	Runtime.getRuntime().exec("shutdown -s -t 0"); //shutdown
	    //Runtime.getRuntime().exec("shutdown -r -t 0"); //restart
		    //Runtime.getRuntime().exec("shutdown -r -t 0"); //restart
		//	Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
		System.out.println(Runtime.getRuntime().availableProcessors()); 
	}
}