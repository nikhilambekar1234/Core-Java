/*Reading data from keyboard
There are many ways to read data from the keyboard. For example:
o	InputStreamReader
o	Console
o	Scanner
o	DataInputStream etc.
InputStreamReader class
InputStreamReader class can be used to read data from keyboard.It performs two tasks:
o	connects to input stream of keyboard
o	converts the byte-oriented stream into character-oriented stream
BufferedReader class
BufferedReader class can be used to read data line by line by readLine() method.
Example of reading data from keyboard by InputStreamReader and BufferdReader class
In this example, we are connecting the BufferedReader stream with the InputStreamReader stream for reading the line by line data from the keyboard.
*/
import java.io.*;
class InputStreamreader
{
	public static void main(String args[])throws Exception
	{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		
		System.out.println("Enter your name");
		String name=br.readLine();
		
		System.out.println("Welcome "+name);
	}
}