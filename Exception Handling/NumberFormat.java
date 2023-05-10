package FileHandling;

import java.util.Scanner;

public class NumberFormat
{
	String s;
	 void get()
    {
   	 System.out.println("First Result");
   	 
   	 try (Scanner sc = new Scanner (System.in))
   	 {
   		 System.out.println("enter string to convert in int");
   		  s=sc.next();
   		 int i=Integer.parseInt(s);  //NumberFormatException
   		 System.out.println("Secon Result ="+i);
   	 }
   	 catch(NumberFormatException e)
   	 {
   		 System.out.println("Exception Handle");
   		 
   	 }
    }
	public static void main(String[] args) 
	{
		NumberFormat d=new NumberFormat();
   	    d.get();

	}

}
