/*Java Regex
The Java Regex or Regular Expression is an API to define pattern for searching or manipulating strings.
It is widely used to define constraint on strings such as password and email validation 
Java Regex API provides 1 interface and 3 classes in java.util.regex package.
java.util.regex package
It provides following classes and interface for regular expressions. The Matcher and Pattern classes are widely used in java regular expression.
1.	MatchResult interface
2.	Matcher class
3.	Pattern class
4.	PatternSyntaxException class
Matcher class
It implements MatchResult interface. It is a regex engine i.e. used to perform match operations on a character sequence
Pattern class
It is the compiled version of a regular expression. It is used to define a pattern for the regex engine.

*/
import java.util.regex.*;
public class RegexExample1
{
	public static void main(String arg[])
	{
		//1st way
		   Pattern p=Pattern.compile(".s");  // . (dot) represent single character
		   Matcher  m=p.matcher("as");
		   Matcher  m1=p.matcher("fas");
		   boolean b=m.matches();    //true
		   boolean k=m1.matches();    //false
		   
		  System.out.println(b);
		  System.out.println(k);
		 
		 //2nd way
		// boolean b2=Pattern.compile(".s").matcher("as").matches(); //true
		// System.out.println(b2);
		
		//3rd way
		//boolean b3=Pattern.matches(".s","as"); //true
		//System.out.println(b3);
	}
}