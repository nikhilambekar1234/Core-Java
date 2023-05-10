//Java String replaceAll() example: replace word
class StringReplaceAll2
{
	public static void main(String arg[])
	{
		String s1="My name is Khan. My name is Bob. My name is Sonoo.";
		String replaceString = s1.replaceAll("is","was");    //replaces all occurrences of "is" to "was"  
		System.out.println(replaceString);
	}
}