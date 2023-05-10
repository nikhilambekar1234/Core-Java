/*Java String compareTo
The java string compareTo() method compares the given string with current string lexicographically. It returns positive number, negative number or 0.
If first string is greater than second string, it returns positive number (difference of character value). If first string is less than second string, it returns negative number and if first string is equal to second string, it returns 0.
1.	s1 > s2 => positive number  
2.	s1 < s2 => negative number  
3.	s1 == s2 => 0  
*/
class StringCopareTo
{
	public static void main(String arg[])
	{
		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
	}
}