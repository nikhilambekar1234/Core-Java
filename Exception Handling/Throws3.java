package FileHandling;

import java.io.*;
public class Throws3
{

	     void method()throws IOException
	    {
	    	System.out.println("before throw method");
	    	
	    }
		public static void main(String[] args)throws IOException     //declare exception 
		{
			
				Throws3 obj=new Throws3();
				obj.method();
			    System.out.println("normal flow");

		}


}
