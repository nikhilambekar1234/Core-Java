import java.io.*;
import java.io.Serializable;
class Address implements Serializable
{
                  Student5 obj=new Student5(111,"NIK");
	String addressLine,city,state;
	public Address(String addressLine,String city,String state)
	{
		this.addressLine=addressLine;
		this.city=city;
		this.state=state;
	}
}
 class Student5 implements Serializable
{
	int id;
	String name;
	Address address;  //HAS-A
	public Student5(int id,String name)
	{
		 
		this.id=id;
		this.name=name;
	}
	
}
class SerializeAggregation
{
	public static void main(String arg[])throws Exception
	{
		//Student5 obj=new Student5(111,"java");
                                     Address address=new Address("kharadi","pune","maharashtra"); 
		
		
		FileOutputStream fout=new FileOutputStream("file5.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		//out.writeObject(obj);
                                     out.writeObject(address);
		  out.flush();
		  System.out.println("success");

                    //DeAggregation

                                    FileInputStream fin=new FileInputStream("file5.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
                                     Address s=(Address)in.readObject();
		//Student5 s=(Student5)in.readObject();
                                    
		System.out.println(s.obj.id+"  "+s.obj.name+"  "+s.addressLine+"  "+s.city+"  "+s.state);
		in.close();
	}
	
}