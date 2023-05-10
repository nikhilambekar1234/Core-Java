import java.io.*;
class DeserializeInheritance
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("file.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		Student1 s=(Student1)in.readObject();
		System.out.println(s.id+"  "+s.name+"  "+s.course+"  "+s.fee);
		in.close();
		
		
		/*ObjectInputStream in=new ObjectInputStream(new FileInputStream("file.txt"));
		Student1 s=(Student1)in.readObject();
		System.out.println(s.id+"  "+s.name+"  "+s.course+"  "+s.fee);
		in.close();*/
	}
}