import java.util.*;
import java.io.*;
class ComparatorCreateProperties
{
	public static void main(String arg[])throws Exception
	{
		Properties p=System.getProperties();
	    p.setProperty("name","nikhil");
		p.setProperty("email","n.r.ambekar108@gmail.com");
		
		p.store(new FileWriter("info.properties"),"javatpoint Properties Example");
		p.store(new FileWriter("info.txt"),"javatpoint Properties Example");
	
	    
	}
	
}