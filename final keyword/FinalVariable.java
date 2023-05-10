/*NOTE=>1-IF WE CREATE ANY FINAL VARIABLE, IT BECOMES CONSTANT, WE CANNOT CHANGE THE VALUE OF FINAL VARIABLE
2-IF WE CREATE ANY FINAL METHOD, WE CANNOT OVERRIDE IT
3-IF WE CREATE ANY FINAL CLASS,WE CANNOT EXTEND IT OR INHERIT IT
*/
class FinalVariable
{
	public static void main(String arg[])
	{
		int a=10;
		     a=a+20;
			 System.out.println("without final variable a = "+a);
			 
		final int b=20;
           //      b=b+30;                                                   	//can not change
                    System.out.println("with final variable b = "+b);					
	}
}