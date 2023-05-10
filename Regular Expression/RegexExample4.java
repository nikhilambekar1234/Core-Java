/*Regex Quantifiers
The quantifiers specify the number of occurrences of a character.
Regex	Description
X?	X occurs once or not at all
X+	X occurs once or more times
X*	X occurs zero or more times
X{n}	X occurs n times only
X{n,}	X occurs n or more times
X{y,z}	X occurs at least y times but less than z times
Regular Expression Character classes and Quantifiers Example
*/
import java.util.regex.*;
class RegexExample4
{
	public static void main(String arg[])
	{
		System.out.println("? quatifier......................................................................................................");
		System.out.println(Pattern.matches("[amn]?","a"));//true(a or m or n comes one time)
		System.out.println(Pattern.matches("[amn]?","aaa"));//false(a comes more than one time)
		System.out.println(Pattern.matches("[amn]?","aammmnn"));//false(a m and n comes more than one time)
		System.out.println(Pattern.matches("[amn]?","aazzta"));//false(a comes more than one time)
		System.out.println(Pattern.matches("[amn]?","am"));//false(a or m or n must come one time)
		
		System.out.println("+quatifier............................................................................................................");
		System.out.println(Pattern.matches("[amn]+","a"));//true (a or m or n once or more times)
	    System.out.println(Pattern.matches("[amn]+","aaa"));//true(a comes more than one time)
	    System.out.println(Pattern.matches("[amn]+","aammmnn"));//true (a or m or n comes more than once)
	    System.out.println(Pattern.matches("[amn]+","aazzta"));//false(z and t are not matching pattern)
		
		System.out.println("*quatifier.......................................................................................");
		System.out.println(Pattern.matches("[amn]*","ammmna"));//true (a or m or n may come zero or more times)
		System.out.println(Pattern.matches("[amn]*","cd"));//false (a or m or n may come zero or more times)
	    System.out.println(Pattern.matches("[amn]*",""));//true (a or m or n may come zero or more times)
		System.out.println(Pattern.matches("[amn]*","dm"));//false (a or m or n may come zero or more times)
		
		System.out.println("{n}quatifier.......................................................................................");
		System.out.println(Pattern.matches("[amn]{2}","n"));//false ( may  occurs n times only)
		System.out.println(Pattern.matches("[amn]{2}","aa"));//true ( may occurs n times only)
		System.out.println(Pattern.matches("[amn]{2}","mmm"));//false ( may occurs n times only)
		System.out.println(Pattern.matches("[amn]{2}","aamm"));//false ( may occurs n times only)
		System.out.println(Pattern.matches("[amn]{2}","am"));//true ( may occurs n times only)
		System.out.println(Pattern.matches("[amn]{2}","nnc"));//false ( may occurs n times only)
		
		System.out.println("{n,}quatifier.......................................................................................");
		System.out.println(Pattern.matches("[amn]{2,}","n"));//false ( occurs n or more times)
		System.out.println(Pattern.matches("[amn]{2,}","nnnn"));//true ( occurs n or more times)
		System.out.println(Pattern.matches("[amn]{2,}","an"));//true ( occurs n or more times)
		System.out.println(Pattern.matches("[amn]{2,}","mmc"));//false ( occurs n or more times)
		
		System.out.println("{y,z}quatifier.......................................................................................");
		System.out.println(Pattern.matches("[amn]{2,4}","n"));//false (  occurs at least y times but less than z times)
		System.out.println(Pattern.matches("[amn]{2,4}","na"));//true (  occurs at least y times but less than z times)
		System.out.println(Pattern.matches("[amn]{2,4}","naamm"));//false (  occurs at least y times but less than z times)
		System.out.println(Pattern.matches("[amn]{2,4}","aak"));//false (  occurs at least y times but less than z times)
		System.out.println(Pattern.matches("[amn]{2,4}","naa"));//true (  occurs at least y times but less than z times)
	}
}