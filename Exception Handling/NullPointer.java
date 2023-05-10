package FileHandling;

import java.util.Scanner;

public class NullPointer
{
	String s=null;
	 void get()
    {
   	 System.out.println("First Result");
   	 
   	 try (Scanner sc = new Scanner (System.in))
   	 {
   		// System.out.println("enter first name");
   		 // String s=sc.next();
         System.out.println(s.length());
   		 
   		 
   	 }
   	 catch(NullPointerException e)
   	 {
   		 System.out.println("Exception Handle");
   		 
   	 }
    }

	public static void main(String[] args) 
	{
		NullPointer d=new NullPointer();
   	     d.get();

	}

}
