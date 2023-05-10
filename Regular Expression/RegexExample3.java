/*Regex Character classes

No.	Character Class	Description
1	[abc]	a, b, or c (simple class)
2	[^abc]	Any character except a, b, or c (negation)
3	[a-zA-Z]	a through z or A through Z, inclusive (range)
4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
5	[a-z&&[def]]	d, e, or f (intersection)
6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
*/
import java.util.regex.*;
class RegexExample3
{
	public static void main(String arg[])
	{
		
		System.out.println("...................1	[abc]	a, b, or c (simple class)..................");
		System.out.println(Pattern.matches("[amn]","m")); //true (among a or m or n)
		System.out.println(Pattern.matches("[amn]","abcd")); //false(not a or m or n)
		System.out.println(Pattern.matches("[amn]","a")); //true (among a or m or n)
		System.out.println(Pattern.matches("[amn]","ammmna"));//false (m and a comes more than once)
		System.out.println(Pattern.matches("[amn]","am"));//false 
		System.out.println(Pattern.matches("[amn]","amn"));//false 
		
		System.out.println(".................2[^abc]	Any character except a, b, or c (negation)....................");
		System.out.println(Pattern.matches("[^amn]","Z"));//true (negation among a or m or n)
		System.out.println(Pattern.matches("[^amn]","m")); //false (negation among a or m or n)
		System.out.println(Pattern.matches("[^amn]","abcd")); //false(negation among a or m or n)
		System.out.println(Pattern.matches("[^amn]","b"));//true (negation among a or m or n)
		System.out.println(Pattern.matches("[amn]","kl"));//false (negation among a or m or n)
		System.out.println(Pattern.matches("[amn]","amn"));//false (negation among a or m or n)
		
		System.out.println("....................3[a-zA-Z]	a through z or A through Z, inclusive (range).................");
		System.out.println(Pattern.matches("[a-z]","m")); //true (a through z,inclusive (range)
		System.out.println(Pattern.matches("[a-z]","M")); //false(a through z,inclusive (range)
		System.out.println(Pattern.matches("[a-z]","ab")); //false (a through z,inclusive (range)
		System.out.println(Pattern.matches("[a-zA-Z]","aB")); //false (a through z,inclusive (range)//  like ("[a-z || A-Z]","aB"))
		System.out.println(Pattern.matches("[a-zA-Z]","B")); //true (a through z,inclusive (range)//  like ("[a-z || A-Z]","aB"))
		
		System.out.println("......................4[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)...............");
		System.out.println(Pattern.matches("[a-d[m-p]]","c")); //true (a through d, or m through p: [a-dm-p] (union))
		System.out.println(Pattern.matches("[a-d[m-p]]","n")); //true (a through d, or m through p: [a-dm-p] (union))
		System.out.println(Pattern.matches("[a-d[m-p]]","an")); //false (a through d, or m through p: [a-dm-p] (union))
		System.out.println(Pattern.matches("[a-d[m-p]]","en")); //false (a through d, or m through p: [a-dm-p] (union))
		System.out.println(Pattern.matches("[a-d[m-p]]","z")); //false (a through d, or m through p: [a-dm-p] (union))
		
		System.out.println("......................5	[a-z&&[def]]	d, e, or f (intersection)...............");
		System.out.println(Pattern.matches("[a-z&&[def]]","c")); //false([a-z&&[def]]	d, e, or f (intersection))
		System.out.println(Pattern.matches("[a-z&&[def]]","e")); //true([a-z&&[def]]	d, e, or f (intersection))
		System.out.println(Pattern.matches("[a-z&&[def]]","ef")); //false([a-z&&[def]]	d, e, or f (intersection))
		
		System.out.println(".................6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)....................");
		System.out.println(Pattern.matches("[a-z&&[^dc]]","c")); //false(6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction))
		System.out.println(Pattern.matches("[a-z&&[^dc]]","e")); //true(6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction))
		System.out.println(Pattern.matches("[a-z&&[^dc]]","ef")); //false(6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction))
	}
}