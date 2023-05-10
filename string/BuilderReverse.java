class BuilderReverse
{
	public static void main(String arg[])
	{
		StringBuilder sb=new StringBuilder("Hello");
		sb.reverse();//now original string is changed
		System.out.println(sb);//prints  olleH 
	}
}