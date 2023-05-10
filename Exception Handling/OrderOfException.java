package FileHandling;

import java.util.Scanner;

public class OrderOfException 
{
	String s=null;
	 void get()
	    {
	   	 System.out.println("First Result");
	   	 
	   	 try (Scanner sc = new Scanner (System.in))
	   	 {
	   		 int arr[]=new int[3];
	   		 System.out.println("enter array");
	   		 for(int i=0;i<arr.length;i++)
	   		 {
	   			 arr[i]=sc.nextInt();
	   		 }
	   	//	 int data=arr[0]/0;
	   	//	System.out.println(" data Result ="+data);
	   		 
	   	/*	System.out.println("your data");
	   		for(int i=0;i<=arr.length;i++)
	   		 {
	   			System.out.println(arr[i]);
	   		 }
	   	*/  
	   		 System.out.println(s.length());
	   	 }
	   	catch(Exception e)
	   	 {
	   
	   		 System.out.println("Parrent Exception Handle");
	   		 
	   	 }
	   	 //order of exception      compilation problem
	  	 catch(ArithmeticException e)
	   	 {
	   
	   		 System.out.println("Arithmetic Exception Handle");
	   		 
	   	 }
	   	 catch(ArrayIndexOutOfBoundsException e)
	   	 {
	   
	   		 System.out.println("Array Exception Handle");
	   		 
	   	 }
	   	
	   	System.out.println("END CODE");
	    }
	public static void main(String[] args) 
	{
		OrderOfException d=new OrderOfException();
  	    d.get();

	}
}
