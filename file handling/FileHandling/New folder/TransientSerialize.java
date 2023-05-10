package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student7 implements Serializable
{
	int id;
	String name;
	transient int age;
	transient String company;
	public Student7(int id,String name,int age,String company)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class TransientSerialize {

	public static void main(String[] args) throws Exception {
		Student7 obj=new Student7(125,"Jay",28,"info tech");
		
		FileOutputStream fout=new FileOutputStream("file7.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(obj);
		out.flush();
		System.out.println("success");
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("file7.txt"));
		Student7 s=(Student7)in.readObject();
		System.out.println(s.id+" "+s.name+" "+s.age+" "+s.company);
		in.close();

	}

}
