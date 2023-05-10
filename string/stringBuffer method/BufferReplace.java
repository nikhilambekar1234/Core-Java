/*Java StringBuffer class
Java StringBuffer class is used to created mutable (modifiable) string. The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.
Important Constructors of StringBuffer class
1.	StringBuffer(): creates an empty string buffer with the initial capacity of 16.
2.	StringBuffer(String str): creates a string buffer with the specified string.
3.	StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length.
Important methods of StringBuffer class+
1.	public synchronized StringBuffer append(String s): is used to append the specified string with this string. The append() method is overloaded like append(char),
 append(boolean), append(int), append(float), append(double) etc.
2.	public synchronized StringBuffer insert(int offset, String s): is used to insert the specified string with this string at the specified position. 
The insert() method is overloaded like insert(int, char), insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc.
3.	public synchronized StringBuffer replace(intstartIndex, intendIndex, String str): is used to replace the string from specified startIndex and endIndex.
4.	public synchronized StringBuffer delete(intstartIndex, intendIndex): is used to delete the string from specified startIndex and endIndex.
5.	public synchronized StringBuffer reverse(): is used to reverse the string.
6.	Public int capacity(): is used to return the current capacity.
7.	public void ensureCapacity(intminimumCapacity): is used to ensure the capacity at least equal to the given minimum.
8.	public char charAt(int index): is used to return the character at the specified position.
9.	Public int length(): is used to return the length of the string i.e. total number of characters.
10.	public String substring(int beginIndex): is used to return the substring from the specified beginIndex.
11.	public String substring(int beginIndex, int endIndex): is used to return the substring from the specified beginIndex and endIndex.
________________________________________
What is mutable string
A string that can be modified or changed is known as mutable string. StringBuffer and StringBuilder classes are used for creating mutable string.
*/
class BufferReplace
{
	public static void main(String arg[])
	{
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(1,3,"java"); 
		System.out.println(sb);  //prints  Hjavalo
	}
}