package FileHandling;

public class FinalizeMethod 
{
    
	public static void main(String[] args)
	{
		FinalizeMethod obj=new FinalizeMethod();
		System.out.println("hashcode is="+obj.hashCode());
		obj=null;
		//calling the garbage collector using gc()
		System.gc();
		System.out.println("end of the garbage collection");

	}
	//defining the finalize method
	protected void finalize()
	{
		System.out.println("called the finalize() method");
	}

}
