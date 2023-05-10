/*Java ByteArrayOutputStream class
Java ByteArrayOutputStream class is used to write data into multiple files. In this stream, the data is written into a byte array that can be written to multiple stream.
The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
The buffer of ByteArrayOutputStream automatically grows according to data.
Closing the ByteArrayOutputStream has no effect.
*/
import java.io.*;
class ByteArrayoutputStream
{
	public static void main(String args[])throws Exception
	{
		FileOutputStream fout1=new FileOutputStream("f1.txt");
		FileOutputStream fout2=new FileOutputStream("f2.txt");
		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		String s="Hello";
		byte bytess[]=s.getBytes();
		bout.write(bytess);
	
		bout.write(65);
		bout.write(32);
		bout.write('B');
		bout.write(new byte[]{32,97,98,99});
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		
		bout.flush();
		bout.close();   //has no effect
		System.out.println("Success........");
	}
}