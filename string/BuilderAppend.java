class BuilderAppend
{
	public static void main(String arg[])
	{
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("java");//now original string is changed
		System.out.println(sb);//prints  Hello java
	}
}