import java.util.*;
import java.io.*;
class Password2
{
   public static void main(String arg[])throws Exception
   {
      FileReader reader=new FileReader("Password1.properties");
	  
	  Properties p=new Properties();
	  p.load(reader);
	  
	  System.out.println(p.getProperty("user"));
	  System.out.println(p.getProperty("password"));
   }
}