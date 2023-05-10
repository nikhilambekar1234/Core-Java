/*Java StringBuffer class
Java StringBuffer class is used to created mutable (modifiable) string. The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.
Important Constructors of StringBuffer class
1.	StringBuffer(): creates an empty string buffer with the initial capacity of 16.
2.	StringBuffer(String str): creates a string buffer with the specified string.
3.	StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length.
*/
class BufferAppend
{
	public static void main(String arg[])
	{
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("java");  //now original string is changed
		System.out.println(sb);//prints hello java
	}
}