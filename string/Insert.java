class Insert
{
	public static void main(String arg[])
	{
		StringBuffer sb=new StringBuffer("Hello");
		sb.insert(1,"java");  // now original string is changed
		System.out.println(sb);  //prints  Hjavaello
	}
}