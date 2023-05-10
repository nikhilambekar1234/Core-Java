/*Java Transient Keyword
Java transient keyword is used in serialization. If you define any data member as transient, it will not be serialized.
Let's take an example, I have declared a class as Student, it has three data members id, name and age. If you serialize the object, all the values will be serialized but I don't want to serialize one value, e.g. age then we can declare the age data member as transient.
Example of Java Transient Keyword
In this example, we have created the two classes Student and PersistExample. The age data member of the Student class is declared as transient, its value will not be serialized.
If you deserialize the object, you will get the default value for transient variable.
*/
import java.io.*;
import java.io.Serializable;
class Student4 implements Serializable
{
	int id;
	String name;
	transient int age;   // now it will not be serialized
	transient String company;   // now it will not be serialized
	public Student4(int id,String name,int age,String company)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.company=company;
	}
}
class TransientKey
{
	public static void main(String arg[])throws Exception
	{
		Student4 obj=new Student4(211,"ravi",25,"kdn");  //creating object
		//writing object into file
		FileOutputStream f=new FileOutputStream("file4.txt");
		ObjectOutputStream out=new ObjectOutputStream(f);
		out.writeObject(obj);
		out.flush();
		out.close();
		f.close();
		System.out.println("success");
	}
}