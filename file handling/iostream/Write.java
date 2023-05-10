import java.io.*;
class Write
{
     public static void main(String arg[])
     {
            try
            {
                    FileOutputStream fout=new FileOutputStream("abc.txt");
                    String s = "Sachin Tendulkar is my favourite player";
                    byte b[]=s.getBytes();              //converting string into byte array  
                    fout.write(b);
                    fout.close();
                    System.out.println("Success....");
            }
            catch(Exception e)
            {
                  System.out.println(e);
            }
     }
}