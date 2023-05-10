/*Compressing and Uncompressing File
The DeflaterOutputStream and InflaterInputStream classes provide mechanism to compress and uncompress the data in thedeflate compression format.
DeflaterOutputStream class:
The DeflaterOutputStream class is used to compress the data in the deflate compression format. It provides facility to the other compression filters, such as GZIPOutputStream.
Example of Compressing file using DeflaterOutputStream class
In this example, we are reading data of a file and compressing it into another file using DeflaterOutputStream class. You can compress any file, here we are compressing the Deflater.java file
*/
import java.io.*;
import java.util.zip.*;
class CompressDeflatorOutput
{
	public static void main(String arg[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("Deflater.java");
			FileOutputStream fout=new FileOutputStream("def.txt");
			DeflaterOutputStream out=new DeflaterOutputStream(fout);
			
			int i;
			while((i=fin.read())!=-1)
			{
				out.write((byte)i);
				out.flush();
			}
			fin.close();
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}