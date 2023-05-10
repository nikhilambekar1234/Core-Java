package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeAggregation {

	public static void main(String[] args) throws Exception {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("f2.txt"));
         Student s=(Student)in.readObject();
         System.out.println(s.id+"  "+s.name);
       // System.out.println(s.address.addressLine+"  "+s.address.city+" "+s.address.state);
         in.close();
	}

}
