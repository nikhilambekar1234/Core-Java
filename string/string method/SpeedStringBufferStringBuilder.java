/*Difference between StringBuffer and StringBuilder

1)	StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
	StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
2)	StringBuffer is less efficient than StringBuilder.	
StringBuilder is more efficient than StringBuffer.
*/
class SpeedStringBufferStringBuilder
{
	public static void main(String arg[])
	{
		long startTime =System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("java");
		for(int i=0;i<10000;i++)
		{
			sb.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer :"+(System.currentTimeMillis()-startTime)+"ms");
		
		startTime=System.currentTimeMillis();
		StringBuilder sb2=new StringBuilder("java");
		for(int i=0;i<10000;i++)
		{
			sb2.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder:"+(System.currentTimeMillis()-startTime)+"ms");
	}
}