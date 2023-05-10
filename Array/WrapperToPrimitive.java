
class WrapperToPrimitive
{
	public static void main(String arg[])
	{
		//converting  Integer into int
		Integer a=new Integer(3); 
         int i=a.intValue();		//converting  Integer into int
		//or
		int j=a;   //unboxing,now copiler will write a.intValue() internally
		
		System.out.println(a+"  "+i+"  "+j);
	}
}