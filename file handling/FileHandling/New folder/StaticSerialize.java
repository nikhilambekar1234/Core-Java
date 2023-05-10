package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student6 implements Serializable
{
	int id;
	String name;
	static String company="info tech";
	public Student6(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class StaticSerialize {

	public static void main(String[] args) throws Exception {
		
	Student6 obj=new Student6(12345,"JAY");
	FileOutputStream fout=new FileOutputStream("file6.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	
	out.writeObject(obj);
	out.flush();
	System.out.println("Success");
	
     ObjectInputStream in=new ObjectInputStream(new FileInputStream("file6.txt"));
     Student6 s=(Student6)in.readObject();
     System.out.println(s.id+"  "+s.name+"  "+s.company);
	}

}
