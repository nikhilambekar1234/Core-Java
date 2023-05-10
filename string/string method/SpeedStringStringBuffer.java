/*Difference between String and StringBuffer

1)	String class is immutable.
	StringBuffer class is mutable.
2)	String is slow and consumes more memory when you concat too many strings because every time it creates new instance.
	StringBuffer is fast and consumes less memory when you cancat strings.
3)	String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method.
	StringBuffer class doesn't override the equals() method of Object class.
*/
class SpeedStringStringBuffer
{
	public static String concatWithString()
	{
		String t="java";
		for(int i=0; i<10000;i++)
		{
			t=t+"Tpoint";
		}
		return t;
	}
	public static String concatWithStringBuffer()
	{
		StringBuffer sb=new StringBuffer("java");
		for(int i=0;i<10000;i++)
		{
			sb.append("Tpoint");
		}
		return sb.toString();
	}
	public static void main(String arg[])
	{
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String : "+(System.currentTimeMillis()-startTime)+"ms");
		
		startTime=System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken by Concating with StringBuffer :"+(System.currentTimeMillis()-startTime)+"ms");
	}
}