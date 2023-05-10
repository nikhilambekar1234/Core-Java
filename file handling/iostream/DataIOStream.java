import java.io.*;
class DataIOStream
{
    public static void main(String arg[])throws Exception
    {
       FileOutputStream fout=new FileOutputStream("file8.txt");
       DataOutputStream dout=new DataOutputStream(fout);
       dout.write(100);
       dout.writeInt(200);
       dout.writeChar('a');
       dout.writeDouble(13.25d);
       dout.writeUTF("info tech");
       dout.writeBoolean(true);

       FileInputStream fin=new FileInputStream("file8.txt");
       DataInputStream din=new DataInputStream(fin);
       System.out.println(din.read());
       System.out.println(din.readInt());
       System.out.println(din.readChar());
       System.out.println(din.readDouble());
       System.out.println(din.readUTF());
       System.out.println(din.readBoolean());
      
    }   
}