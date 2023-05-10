package FileHandling;

import java.io.*;

public class write {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fout=new FileOutputStream("abc.txt");
			String s = "Sachin Tendulkar is my favourite player";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success......");
			
		}
		catch(Exception e) {
			
			System.out.println(e);
		}

	}

}
