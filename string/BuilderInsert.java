class BuilderInsert
{
	public static void main(String arg[])
	{
		StringBuilder sb=new StringBuilder("Hello");
		sb.insert(1,"java");//now original string is changed
		System.out.println(sb);//prints  Hjavaello 
	}
}