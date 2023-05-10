package FileHandling;

import java.util.Scanner;

public class Arithmatic2
{
    int i=50;
    int j=0;
    int data;
    void get()
    {
   	 System.out.println("First Result");
   	 
   	 try (Scanner sc = new Scanner (System.in))
   	 {
   		 //System.out.println("enter first num and second num");
   		 // i=sc.nextInt();
   		 // j=sc.nextInt();
   		  data=i/j;  //may throw exception
   		  System.out.println("Secon Result ="+data);
   	 }
   	 catch(Exception e)
   	 {
   		 System.out.println(i/(j+2));//resolving exception
   		 System.out.println("Exception Handle");
   		 
   	 }
    }
	public static void main(String[] args)
	{
		Arithmatic2 d=new Arithmatic2();
   	    d.get();

	}

}
