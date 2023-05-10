public class SqlDate
{
	public static void main(String arg[])
	{
		long millis=System.currentTimeMillis();
		java.sql.Date date=new java.sql.Date(millis);
		System.out.println(date);
	}
}