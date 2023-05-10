/*Example of SequenceInputStream that reads the data from two files
In this example, we are writing the data of two files f1.txt and f2.txt into another file named f3.txt.
*/
import java.io.*;
class SequenceInputstream1
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin1=new FileInputStream("f1.txt");
		FileInputStream fin2=new FileInputStream("f2.txt");
		
		FileOutputStream fout=new FileOutputStream("f3.txt");
		
		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		int i;
		while((i=sis.read())!=-1)
		{
			fout.write(i);
		}
		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
		System.out.println("Success....");
	}
}