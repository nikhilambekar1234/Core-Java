import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.*;
public class Employee implements Externalizable
{
      int id;
      String name;
      double sal;
      String deptname;
      String addr;
      public Employee(){}
      public Employee(int id,String name,double sal,String deptname,String addr)
      {
           super();
           this.id=id;
           this.name=name;
           this.sal=sal;
           this.deptname=deptname;
           this.addr=addr;
      }
       @Override
       public void readExternal(ObjectInput oi)throws IOException,ClassNotFoundException
       {
             System.out.println("readexternal method executing");
             name=(String)oi.readObject();
             //deptname=(String)oi.readObject();
       }
        @Override
       public void writeExternal(ObjectOutput oo)throws IOException
       {
             System.out.println("writeexternal method executing");
             oo.writeObject(name);
             oo.writeObject(deptname);
       }
}