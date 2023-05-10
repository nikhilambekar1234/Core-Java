package FileHandling;

import java.util.Scanner;

public class HandleByDifferent 
{
	int a,b,c;
	 void get()
    {
   	 System.out.println("First Result");
   	 
   	 try (Scanner sc = new Scanner (System.in))
   	 {
   		 System.out.println("enter first num and second num");
   		  a=sc.nextInt();
   		  b=sc.nextInt();
   		  c=a/b;
   		  System.out.println("Secon Result ="+c);
   	 }
   	 catch(ArrayIndexOutOfBoundsException e)
   	 {
   		 System.out.println("Exception Handle");
   		 
   	 }
    }
	public static void main(String[] args)
	{
		HandleByDifferent  d=new HandleByDifferent ();
   	    d.get();

	}

}
