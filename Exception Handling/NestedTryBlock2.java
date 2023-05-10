package FileHandling;

public class NestedTryBlock2 
{

	public static void main(String[] args) 
	{
		//main block
		 try
		 {
			 //inner try block 1
			 try
			 {
				//inner try block 2
				 try
				 {
					 int arr[]= {1,2,3,4};
					 System.out.println(arr[10]);
				 }
				 catch(ArithmeticException e)
				 {
					 System.out.println("Arithmetic handle");
					 System.out.println("inner try block 2");
				 }
			 }
			 catch(ArithmeticException e)
			 {
				 System.out.println("Arithmetic handle");
				 System.out.println("inner try block 1");
			 }
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e);
			 System.out.println("outer main try block");
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
			 System.out.println("handle by parent exception");
		 }

	}

}
