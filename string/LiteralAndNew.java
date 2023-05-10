/*java.lang.String class 
The java String is immutable i.e. it cannot be changed but a new instance is created. For mutable class, you can use StringBuffer and StringBuilder class.
What is String in java
Generally, string is a sequence of characters. But in java, string is an object that represents a sequence of characters. String class is used to create string object.
How to create String object?
There are two ways to create String object:
1.	By string literal
2.	By new keyword
Note: String objects are stored in a special memory area known as string constant pool.
Why java uses concept of string literal?
To make Java more memory efficient (because no new objects are created if it exists already in string constant pool).
*/
class LiteralAndNew 
{
	public static void main(String arg[])
	{
		String s1="java";//creating string by java string literal
		char ch[]={'s','t','r','i','n','g','s'};
		String s2=new String(ch);//converting char array to string
		String s3=new String("example");//creating java string by new keyword
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

