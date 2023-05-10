import java.io.*;
class Test5
{
         void run()
         {
             try
           {
             FileInputStream fin=new FileInputStream("data1.txt");  //implicity throw checked(here not propagate)
            System.out.println("take input");
         //  throw new IOException("file not present");  //explicitly throw
           }
           catch(IOException e)
           {
                      System.out.println(e);
                      System.out.println("handle CODE");
           }
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
            Test5 obj=new Test5();
           
               obj. get();
             
            System.out.println("END CODE");
             
             
         }
}