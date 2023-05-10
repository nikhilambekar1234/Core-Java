import java.io.*;
class Test6
{
         void run()
         {
            
            FileInputStream fin=new FileInputStream("data1.txt");
           System.out.println("take input");
           throw new IOException("file not present");  //explicitly throw(not propagate checked exception by only throw)
            
       }    
        void fun()
         {
              run();
         }
         void get()
         {
               fun();
         }
         public static void main(String arg[])
         {
            Test6 obj=new Test6();
             
              try
           {
                obj. get();
           }
           catch(IOException e)
           {
                      System.out.println(e);
                      System.out.println("handle CODE");
           }
               
             
            System.out.println("END CODE");
             
             
         }
}