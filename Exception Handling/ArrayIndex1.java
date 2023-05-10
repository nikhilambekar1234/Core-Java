package FileHandling;

import java.util.Scanner;

public class ArrayIndex1 
{
	
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
   		System.out.println("Your Array");
   		for(int i=0;i<=arr.length;i++)
  		 {
   			System.out.println(arr[i]);
  		 }
   		  
   	 }
   	 catch(ArrayIndexOutOfBoundsException e)
   	 {
   		System.out.println(e);
   		 System.out.println("Exception Handle");
   		 
   	 }
    }
	public static void main(String[] args) 
	{
		ArrayIndex1 d=new ArrayIndex1();
   	    d.get();

	}

}
