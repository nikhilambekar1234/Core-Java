package FileHandling;
import java.util.Scanner;



public class Arithmatic1
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
    	 catch(ArithmeticException e)
    	 {
    		 System.out.println("Exception Handle");
    		 
    	 }
     }
     
	public static void main(String[] args)
	{
		 Arithmatic1 d=new Arithmatic1();
    	 d.get();

	}

}
