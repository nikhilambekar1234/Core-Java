//Java String replaceAll() example: replace character
class StringReplaceAll1
{
	public static void main(String arg[])
	{
		String s1="javatpoint is a very good website";
		String replaceString = s1.replaceAll("a","e");    //replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);
	}
}