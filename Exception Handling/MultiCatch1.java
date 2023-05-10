package FileHandling;

import java.util.Scanner;

public class MultiCatch1
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
	   		// int data=arr[0]/0;
	   		//System.out.println(" data Result ="+data);
	   		 
	   	/*	System.out.println("your data");
	   		for(int i=0;i<=arr.length;i++)
	   		 {
	   			System.out.println(arr[i]);
	   		 }
	   	*/  
	   		 System.out.println(s.length());
	   	 }
	   	 catch(ArithmeticException e)
	   	 {
	   
	   		 System.out.println("Arithmetic Exception Handle");
	   		 
	   	 }
	   	 catch(ArrayIndexOutOfBoundsException e)
	   	 {
	   
	   		 System.out.println("Array Exception Handle");
	   		 
	   	 }
	   	catch(Exception e)
	   	 {
	   
	   		 System.out.println("Parrent Exception Handle");
	   		 
	   	 }
	   	System.out.println("END CODE");
	    }
	public static void main(String[] args) 
	{
		MultiCatch1 d=new MultiCatch1();
   	    d.get();

	}

}
