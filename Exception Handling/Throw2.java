package FileHandling;
import java.io.*;
public class Throw2
{
    public static void method() throws FileNotFoundException
    {
    	FileReader file=new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\NikJava\\src\\Throw.txt");
    	BufferedReader fin=new BufferedReader(file);
    	throw new FileNotFoundException();
    }
	public static void main(String[] args) 
	{
		try
		{
			method();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("END CODE");

	}

}
