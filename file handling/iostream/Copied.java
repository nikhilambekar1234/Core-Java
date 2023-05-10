//Example of Reading the data of current java file and writing it into another file
import java.io.*;
class Copy
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("Copy.java");
		FileOutputStream fout=new FileOutputStream("Copied.java");
		int i=0;
		while((i=fin.read())!=-1)
		{
			fout.write((byte)i);
		}
		fin.close();
		fout.close();
		System.out.println("Success.........");
	}
}
