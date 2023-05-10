//Example of SequenceInputStream class that reads the data from multiple files using enumeration
import java.io.*;
import java.util.*;

class Enumerate
{
	public static void main(String arg[])throws IOException
	{
		//creating the FileInputStream object for all the files
                                   FileInputStream fin2=new FileInputStream("file2.txt");
		FileInputStream fin3=new FileInputStream("file3.txt");
		FileInputStream fin=new FileInputStream("file1.java");
		
		//FileInputStream fin4=new FileInputStream("file4.java");
		
		//creatingVector object to all the stream
		
		Vector v=new Vector();
                                   v.add(fin2);
		v.add(fin3);
		v.add(fin);
		
	
		
		//creating enumeration object by calling the elements method
		Enumeration  e=v.elements();
		
		//passing enumeration object by calling in the constructor
		SequenceInputStream bin=new SequenceInputStream(e);
		
		int i=0;
		while((i=bin.read())!=-1)
		{
			System.out.print((char)i);
		}
		bin.close();
		fin.close();
		fin2.close();
	}
}