/*Java Scanner class
There are various ways to read input from the keyboard, the java.util.Scanner class is one of them.
The Java Scanner class breaks the input into tokens using a delimiter that is whitespace bydefault. It provides many methods to read and parse various primitive values.
Java Scanner class is widely used to parse text for string and primitive types using regular expression.
Java Scanner class extends Object class and implements Iterator and Closeable interfaces.
*/
import java.util.Scanner;
class ScannerTest
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter your roll");
		int roll=sc.nextInt();
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your fee");
		double fee=sc.nextDouble();
		System.out.println("roll = "+roll+"  name ="+name+"   fee = "+fee);
		sc.close();
	}
}