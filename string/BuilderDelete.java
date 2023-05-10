class BuilderDelete
{
	public static void main(String arg[])
	{
		StringBuilder sb=new StringBuilder("Hello");
		sb.delete(1,3);//now original string is changed
		System.out.println(sb);//prints  Hlo 
	}
}