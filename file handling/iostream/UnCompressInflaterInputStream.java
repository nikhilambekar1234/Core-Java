/*InflaterInputStream class:
The InflaterInputStream class is used to uncompress the file in the deflate compression format. It provides facility to the other uncompression filters, such as GZIPInputStream class.
Example of uncompressing file using InflaterInputStream class
In this example, we are decompressing the compressed file def.txt into D.java .
*/
import java.io.*;
import java.util.zip.*;
class UnCompressInflaterInputStream
{
	public static void main(String arg[])
	{
		try
		{
			//FileInputStream fin=new FileInputStream("def.txt");
			//InflaterInputStream in=new InflaterInputStream(fin);
			InflaterInputStream in=new InflaterInputStream(new FileInputStream("def.txt"));
			FileOutputStream fout=new FileOutputStream("D.java");
			
			int i;
			while((i=in.read())!=-1)
			{
				fout.write((byte)i);
				fout.flush();
			}
			//fin.close();
			fout.close();
			in.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}