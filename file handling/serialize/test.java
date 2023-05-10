/*Deserialization in java
Deserialization is the process of reconstructing the object from the serialized state.It is the reverse operation of serialization.
ObjectInputStream class
An ObjectInputStreamdeserializes objects and primitive data written using an ObjectOutputStream.

*/
import java.io.*;
class test
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("f.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		Student s=(Student)in.readObject();
		System.out.println(s.id+"  "+s.name);
		in.close();
		
		
		/*ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
		Student s=(Student)in.readObject();
		System.out.println(s.id+"  "+s.name);
		in.close();*/
	}
}