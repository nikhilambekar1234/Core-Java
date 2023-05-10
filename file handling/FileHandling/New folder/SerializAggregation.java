package FileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable
{
	String addressLine,city,state;
	public Address(String addressLine,String city,String state)
	{
		this.addressLine=addressLine;
		this.city=city;
		this.state=state;
	}
}
class Student implements Serializable
{
	Address address=new Address("kharadi","pune","maharashtra");
	int id;
	String name;
	//Address address;
	public Student(int id,String name)
	{
		
		this.id=id;
		this.name=name;
	}
}
public class SerializAggregation {

	public static void main(String[] args) throws Exception {
		
     Student s=new Student(121,"NIL");
     
     FileOutputStream fout=new FileOutputStream("f2.txt");
     ObjectOutputStream out=new ObjectOutputStream(fout);
     
     out.writeObject(s);
     out.flush();
     System.out.println("success");
     
	}

}
