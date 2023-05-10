import java.io.*;
import java.io.Serializable;
class Address1 implements Serializable
{
           
	String addressLine,city,state;
	public Address1(String addressLine,String city,String state)
	{
		this.addressLine=addressLine;
		this.city=city;
		this.state=state;
	}
}
 class Student6 implements Serializable
{
                  Address1 address=new Address1("kharadi","pune","maharashtra"); 
	int id;
	String name;
	//Address1 address;  //HAS-A
	public Student6(int id,String name)
	{
		 
		this.id=id;
		this.name=name;
	}
	
}
class SerializeAggregation1
{
	public static void main(String arg[])throws Exception
	{
		Student6 obj=new Student6(111,"NIK");
                                     
		FileOutputStream fout=new FileOutputStream("file6.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		  out.writeObject(obj);
		  out.flush();
		  System.out.println("success");

                   //DeAggregation

                                    FileInputStream fin=new FileInputStream("file6.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		Student6 s=(Student6)in.readObject();
                               
                                   System.out.println(s.id+"  "+s.name+"  "+s.address.addressLine+"  "+s.address.city+"  "+s.address.state);
		in.close();
	}
	
}