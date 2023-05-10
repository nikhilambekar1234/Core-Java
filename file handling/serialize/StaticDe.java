
import java.io.*;
class StaticDe
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("file3.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		Student3 s=(Student3)in.readObject();
		System.out.println(s.id+"  "+s.name+"  "+s.company1+"  "+s.company2);
		in.close();
    }
}