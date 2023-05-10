package FileHandling;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileNotFound
{
    PrintWriter pw;
    void get()
    {
    	try
    	{
    		pw=new PrintWriter("printwriterfile.txt");  //may throw exception
        	pw.println("saved");
    	}
    	catch(FileNotFoundException e)
    	{
    		System.out.println(e);
    		System.out.println("handle exception");
    	}
    	System.out.println("file save successfull");
    	
    }
	public static void main(String[] args)
	{
		FileNotFound d=new FileNotFound();
   	    d.get();
    }
}
