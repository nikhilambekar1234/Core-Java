//Java Scanner Example with delimiter
//Let's see the example of Scanner class with delimiter. The \s represents whitespace.

import java.util.Scanner;
class ScannerTest1
{
	public static void main(String arg[])
	{
		String input="10 tea 20 coffee 30 tea buiscuits";
		Scanner s=new Scanner(input).useDelimiter("\\s");
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.nextInt());
		s.close();
	}
}