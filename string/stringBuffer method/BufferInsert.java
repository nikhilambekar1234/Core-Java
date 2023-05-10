class BufferInsert
{
	public static void main(String arg[])
	{
		StringBuffer sb=new StringBuffer("Hello");
		sb.insert(1,"java"); 
		System.out.println(sb); //prints HJavaello  
	}
}