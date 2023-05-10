/*Wrapper class in Java
Wrapper class in java provides the mechanism to convert primitive into object and object into primitive.
Since J2SE 5.0, autoboxing and unboxing feature converts primitive into object and object into primitive automatically. 
The automatic conversion of primitive into object is known and autoboxing and vice-versa unboxing.
One of the eight classes of java.lang package are known as wrapper class in java. The list of eight wrapper classes are given below:
*/

class PrimitiveToWrapper
{
	public static void main(String arg[])
	{
		//converting int into Integer
		int a=20;
		Integer i=Integer.valueOf(a);   //converting into into Integer
		//or
		Integer j=a;   //autoboxing,now copiler will write Integer.valueOf(a) internally
		
		System.out.println(a+"  "+i+"  "+j);
	}
}