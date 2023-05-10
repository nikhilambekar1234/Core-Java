//Another Example of reading data from keyboard by InputStreamReader and BufferdReader class until the user writes stop
import java.io.*;
class InputStreamreader1
{
	public static void main(String args[])throws Exception
	{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		String name="";
		while(!name.equals("stop"))
		{
			System.out.println("Enter data");
			name=br.readLine();
			System.out.println("data is "+name);
		}
    	br.close();
		r.close();
	}
}