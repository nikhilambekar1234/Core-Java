
import java.io.*;
class DeAggregation
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("file5.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
                                     Address s=(Address)in.readObject();
		//Student5 s=(Student5)in.readObject();
                                    
		System.out.println(s.obj.id+"  "+s.obj.name+"  "+s.addressLine+"  "+s.city+"  "+s.state);
		in.close();
    }
}