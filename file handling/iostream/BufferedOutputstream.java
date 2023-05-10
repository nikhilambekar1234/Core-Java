/*Java BufferedOutputStream class
Java BufferedOutputStream class uses an internal buffer to store data. It adds more efficiency than to write data directly into a stream. 
So, it makes the performance fast.
In this example, we are writing the textual information in the BufferedOutputStream object which is connected to the FileOutputStream object. 
The flush() flushes the data of one stream and send it into another. It is required if you have connected the one stream with another.
*/
import java.io.*;
class BufferedOutputstream
{
	public static void main(String args[])throws Exception
	{
		FileOutputStream fout=new FileOutputStream("data1.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Sachin is my favourite player";
		byte b[]=s.getBytes();
		bout.write(b);
		
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success");
	}
}