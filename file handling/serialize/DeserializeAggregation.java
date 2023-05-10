import java.io.*;
class DeserializeAggregation
{
    public static void main(String arg[])throws Exception
    {
        FileInputStream fin=new FileInputStream("f.txt");
        ObjectInputStream Oout=new ObjectInputStream(fin);
        Student s=(Student)Oout.readObject();
        System.out.println(s.id+"  "+s.name+"  "+s.address.addressLine+"  "+s.address.city+"  "+s.address.state);
        fin.close();
        Oout.close();
        System.out.println("success");
    }
}