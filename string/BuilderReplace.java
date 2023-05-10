class BuilderReplace
{
	public static void main(String arg[])
	{
		StringBuilder sb=new StringBuilder("Hello");
		sb.replace(1,3,"java");//now original string is changed
		System.out.println(sb);//prints  Hjavalo 
	}
}