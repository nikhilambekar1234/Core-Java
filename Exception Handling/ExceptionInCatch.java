package FileHandling;

import java.util.Scanner;

public class ExceptionInCatch 
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
   		  System.out.println("Second Result ="+c);
   	 }
   	 catch(Exception e)
   	 {
   		System.out.println("catch block");
   		int data2=a/b;
   	 System.out.println("Third Result ="+data2);
   		 System.out.println("Exception Handle");
   		 
   	 }
   	System.out.println("The end");
    }
	public static void main(String[] args) 
	{
		ExceptionInCatch d=new ExceptionInCatch();
   	    d.get();


	}

}
