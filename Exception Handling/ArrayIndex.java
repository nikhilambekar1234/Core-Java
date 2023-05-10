package FileHandling;

import java.util.Scanner;

public class ArrayIndex
{
	
		
		 void get()
	     {
	    	 System.out.println("First Result");
	    	 
	    	 try (Scanner sc = new Scanner (System.in))
	    	 {
	    		 int arr[]=new int[3];
	    		 System.out.println("enter num");
	    		  arr[4]=sc.nextInt();
	    		  
	    		  System.out.println("Secon Result ="+arr[4]);
	    	 }
	    	 catch(ArrayIndexOutOfBoundsException e)
	    	 {
	    		 System.out.println("Exception Handle");
	    		 
	    	 }
	     }
	public static void main(String[] args) 
	{
		ArrayIndex d=new ArrayIndex();
   	    d.get();

	}

}
