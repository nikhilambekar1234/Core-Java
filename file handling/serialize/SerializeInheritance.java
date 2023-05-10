/*Java Serialization with Inheritance (IS-A Relationship)
If a class implements serializable then all its sub classes will also be serializable
Now you can serialize the Student class object that extends the Person class which is Serializable.
Parent class properties are inherited to subclasses so if parent class is Serializable, subclass would also be.
*/
import java.io.*;
import java.io.Serializable;
class Person implements Serializable
{
	int id;
	String name;
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class Student1 extends Person
{
	String course;
	int fee;
	public Student1(int id,String name,String course,int fee)
	{
		super(id,name);
		this.course=course;
		this.fee=fee;
	}
}
public class SerializeInheritance
{
	public static void main(String arg[])throws Exception
	{
		Student1 obj=new Student1(121,"nik","java",40000);
	
	    FileOutputStream fout=new FileOutputStream("file.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(obj);
		out.flush();
		System.out.println("success");
	}
	    
}