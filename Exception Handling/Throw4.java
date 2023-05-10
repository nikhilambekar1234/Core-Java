package FileHandling;

import java.util.Scanner;

public class Throw4 
{
	 void method(int num)
	{
	
		if(num<1)
		{
			System.out.println("First statement");
			throw new ArithmeticException("Number is negative");
			
		}
		else
		{
			System.out.println("square = "+(num*num));
		}
	}
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in))
		{
			Throw4 obj=new Throw4();
			System.out.println("Enter num");
			int num=sc.nextInt();
			obj.method(num);
			
			System.out.println("END CODE");
		}
		
		
	}

}
