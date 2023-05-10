import java.io.*;
//Java Serialization with static data member
//If there is any static data member in a class, it will not be serialized because static is the part of class not object.

import java.io.Serializable; 
class Student3 implements Serializable
{
	int id;
	String name;
   static String company1="kdn";                               //it won't be serialized
   String company2="IT";
    Student3(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class StaticSerialize
{
	public static void main(String arg[])throws Exception
	{
		Student3 obj=new Student3(121,"nik");
		
		FileOutputStream fout=new FileOutputStream("file3.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(obj);
		out.flush();
		System.out.println("success");
	}
	
}