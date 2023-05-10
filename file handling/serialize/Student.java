/*Serialization in Java
Serialization in java is a mechanism of writing the state of an object into a byte stream.
It is mainly used in Hibernate, RMI, JPA(java perstitentapi), EJB(enterprsie java bean), JMS(java message service) technologies.
The reverse operation of serialization is called deserialization.
The String class and all the wrapper classesimplementsjava.io.Serializable interface by default.
java.io.Serializable interface
Serializable is a marker interface (has no body). It is just used to "mark" java classes which support a certain capability.
It must be implemented by the class whose object you want to persist.
ObjectOutputStream class
The ObjectOutputStream class is used to write primitive data types and Java objects to an OutputStream.
 Only objects that support the java.io.Serializable interface can be written to streams.
In this example, we are going to serialize the object of Student class. The writeObject() method of ObjectOutputStream class provides the functionality
 to serialize the object. We are saving the state of the object in the file named f.txt.
*/
import java.io.*;
import java.io.Serializable; 
public class Student  implements Serializable
{
	 int id;  
	 String name;  
	 public Student(int id, String name)
	 {  
	    this.id = id;  
	    this.name = name;  
	 }  
	public static void main(String args[])throws Exception
	{
		Student s1=new Student(211,"ravi");
		
		FileOutputStream fout=new FileOutputStream("f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		System.out.println("success");
	}
}