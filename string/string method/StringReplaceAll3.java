//Java String replaceAll() example: remove white spaces
import java.util.regex.PatternSyntaxException;
class StringReplaceAll3
{
	public static void main(String arg[]) 
	{
		String s1="My name is Khan. My name is Bob. My name is Sonoo.";
		String replaceString = s1.replaceAll("\\is","");    //replaces all occurrences of "is" to "was"  
		System.out.println(replaceString);  //MynamewasKhan.MynamewasBob.MynamewasSonoo.
	}
}