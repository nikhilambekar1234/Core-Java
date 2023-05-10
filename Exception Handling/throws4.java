package FileHandling;

import java.io.IOException;

public class throws4
{
	    void method()throws IOException
	    {
	    	System.out.println("before throw method");
	    	throw new IOException("Device error");
	    	
	    }
		public static void main(String[] args)throws IOException     //declare exception 
		{
			
				throws4 obj=new throws4();
				obj.method();
			    System.out.println("normal flow");

		}


}
