/*Regex Meta characters
The regular expression meta characters work as a short codes.
Regex	Description
.	Any character (may or may not match terminator)
\d	Any digits, short of [0-9]
\D	Any non-digit, short for [^0-9]
\s	Any whitespace character, short for [\t\n\x0B\f\r]
\S	Any non-whitespace character, short for [^\s]
\w	Any word character, short for [a-zA-Z_0-9]
\W	Any non-word character, short for [^\w]
\b	A word boundary
\B	A non word boundary
________________________________________
Regular Expression Metacharacters Example
*/
import java.util.regex.*;
class MetaCharacters
{
	public static void main(String arg[])
	{
		System.out.println("metacharacters d.....");// d means digit
		System.out.println(Pattern.matches("\\d","abc"));//false(non-digit)
		System.out.println(Pattern.matches("\\d","1"));//true(digit and comes once)
		System.out.println(Pattern.matches("\\d","4443"));//false(digit but comes more than once)
		System.out.println(Pattern.matches("\\d","323abc"));//false(digit and char)
		
		System.out.println("metacharacters D.......");//D means non-digit
		System.out.println(Pattern.matches("\\D","abc"));//false(non-digit but comes more than once)
		System.out.println(Pattern.matches("\\D","1"));//false(digit)
		System.out.println(Pattern.matches("\\D","4443"));//false(digit)
		System.out.println(Pattern.matches("\\D","323abc"));//false(digit and char)
		System.out.println(Pattern.matches("\\D","m"));//true(non-digit and comes once)
		
		System.out.println("metacharacters D with quantifier.......");
		System.out.println(Pattern.matches("\\D*","mak"));//true(non-digit and may comes 0 or more times)
		
		System.out.println("metacharacters s.......");//s means space
		System.out.println(Pattern.matches("\\s","\t"));//true
		System.out.println(Pattern.matches("\\s","\t\t"));//false
		System.out.println(Pattern.matches("\\s","\t\n"));//false
		
		System.out.println("metacharacters w.......");//w  means Any word character, short for [a-zA-Z_0-9]
		System.out.println(Pattern.matches("\\w","k"));//true
		System.out.println(Pattern.matches("\\w","k9"));//false
		System.out.println(Pattern.matches("\\w","9"));//true
		System.out.println(Pattern.matches("\\w","99"));//false
	}
}