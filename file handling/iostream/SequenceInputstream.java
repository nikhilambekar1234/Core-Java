/*Java SequenceInputStream class
Java SequenceInputStream class is used to read data from multiple streams. It reads data of streams one by one
*/
import java.io.*;
class SequenceInputstream
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin1=new FileInputStream("f1.txt");
		FileInputStream fin2=new FileInputStream("f2.txt");
		
		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		int i;
		while((i=sis.read())!=-1)
		{
			System.out.print((char)i);
		}
		sis.close();
		fin1.close();
		fin2.close();
	}
}