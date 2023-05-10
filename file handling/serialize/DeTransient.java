import java.io.*;
class DeTransient
{
	public static void main(String args[])throws Exception
	{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("file4.txt"));
	    Student4 s=(Student4)in.readObject();
	    System.out.println(s.id+"  "+s.name+"  "+s.age+"  "+s.company);
	    in.close();
	}
	
}