package FileHandling;
//Example 1: Throwing Unchecked Exception
import java.util.Scanner;

public class Throw 
{
        
		public static void validate(int age)
		{
		
			if(age<=18)
			{
				System.out.println("First statement");
				throw new ArithmeticException("person is not eligible to vote");
				
			}
			else
			{
				System.out.println("person is eligible to vote");
			}
		}
		public static void main(String[] args)
		{
			try (Scanner sc = new Scanner(System.in))
			{
				System.out.println("Enter your age");
				int age=sc.nextInt();
				validate(age);
			}
			System.out.println("END CODE");
			
		}
	

}
