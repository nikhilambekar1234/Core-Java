package FileHandling;
import java.io.*;
public class PrintStreamTest {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fout=new FileOutputStream("mfile.txt");
		PrintStream pout=new PrintStream(fout);
		pout.println(1900);
		pout.println("Hello java");
		pout.println("welcome to java");
		pout.close();
		fout.close();

	}

}
