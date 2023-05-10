package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	int fee;
	String course;
	public Student1(int id,String name,String course,int fee)
	{
		super(id,name);
		this.course=course;
		this.fee=fee;
	}
}
public class SerializInherit {

	public static void main(String[] args) throws Exception {
		
		Student1 s=new Student1(1,"NIK","develope",4000);
		
		FileOutputStream fout=new FileOutputStream("f1.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s);
		out.flush();
		out.close();
		System.out.println("success");
        
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("f1.txt"));
		Student1 obj=(Student1)in.readObject();
		System.out.println(obj.id+" "+obj.name+"  "+obj.course+" "+obj.fee);
	}

}
