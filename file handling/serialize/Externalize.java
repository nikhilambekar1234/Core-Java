import java.io.*;
public class Externalize
{
    public static void main(String arg[])throws Exception
    {
           FileOutputStream fout=new FileOutputStream("file9.txt");
           ObjectOutputStream Oout=new ObjectOutputStream(fout);
           Employee e=new Employee(101,"ram",700.00,"dev","amt");
           Oout.writeObject(e);
           System.out.println("success");

          FileInputStream fin=new FileInputStream("file9.txt");
          ObjectInputStream Oin=new ObjectInputStream(fin);
          Employee e1=(Employee)Oin.readObject();
          System.out.println(e1.id);
          System.out.println(e1.name);
          System.out.println(e1.sal);
          System.out.println(e1.deptname);
          System.out.println(e1.addr);
          
         
    }
}