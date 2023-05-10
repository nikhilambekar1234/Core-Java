//Example of java.io.PrintStream class:
//In this example, we are simply printing integer and string values.

import java.io.*;
class PrintStreamOut
{
	public static void main(String arg[])throws Exception
	{
		FileOutputStream fout=new FileOutputStream("mfile.txt");
		PrintStream pout=new PrintStream(fout);
		pout.println(1900);
		pout.println("Hello Java");
		pout.println("Welcome to Java");
		pout.close();
		fout.close();
		System.out.println("success");
	}
}