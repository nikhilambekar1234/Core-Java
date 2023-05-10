/*java FileWriter and FileReader (File Handling in java)
Java FileWriter and FileReader classes are used to write and read data from text files. These are character-oriented classes, used for file handling in java.
Java has suggested not to use the FileInputStream and FileOutputStream classes if you have to read and write the textual information.
*/
import java.io.*;
class Filewriter
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw=new FileWriter("abc.txt");
			fw.write("My name is sachin");
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Success");
	}
}