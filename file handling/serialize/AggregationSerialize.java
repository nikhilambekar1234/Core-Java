import java.io.*;
import java.io.Serializable;  
class Address implements Serializable
{  
      String addressLine,city,state;  
      public Address(String addressLine, String city, String state)
     {  
	this.addressLine=addressLine;  
	this.city=city;  
                 this.state=state;  
      }  
}  
class Student implements Serializable
{  
      int id;  
      String name;  
     Address address;//HAS-A  
      public Student(int id, String name, Address address) 
    {  
	  this.id = id;  
	  this.name = name;  
                   this.address=address;
    }  
}  
public class AggregationSerialize
{
     public static void main(String args[])throws Exception
     {
             
             Address ad = new Address("kharadi","pune","maharashtra");
             Student s1=new Student(515,"India",ad);
             FileOutputStream fout=new FileOutputStream("f.txt");
             ObjectOutputStream out=new ObjectOutputStream(fout);

             out.writeObject(s1);
             out.flush();
              out.close();
              System.out.println("success");
     }
}
