/*StringTokenizer in Java
The java.util.StringTokenizer class allows you to break a string into tokens. It is simple way to break string.
It doesn't provide the facility to differentiate numbers, quoted strings, identifiers etc. like StreamTokenizer class. We will discuss about the StreamTokenizer class in I/O chapter.
*/
import java.util.StringTokenizer;
class Tokenizer
{
	public static void main(String arg[])
	{
		StringTokenizer st=new StringTokenizer("my name is nik"," ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}