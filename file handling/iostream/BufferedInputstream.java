/*Java BufferedInputStream class
Java BufferedInputStream class is used to read information from stream. It internally uses buffer mechanism to make the performance fast.
*/
import java.io.*;
class BufferedInputstream
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("data1.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			int i;
			while((i=bin.read())!=-1)
			{
				System.out.print((char)i);
			}
			bin.close();
			fin.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}