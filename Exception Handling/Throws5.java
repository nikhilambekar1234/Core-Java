package FileHandling;

import java.util.Scanner;

public class Throws5 
{
	public static int divideNum(int m,int n)throws ArithmeticException
	{
	     int div=m/n;
	     return div;
		
	}
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter two num");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(divideNum(a,b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number not divide by 0");
		}
		System.out.println("END CODE");
		
	}
}
