import java.io.IOException;
class Throws1
{
     void m()throws IOException
      {
            System.out.println("m1 method");
             try
            {
                  throw new IOException("device error"); //not write after throw
                 // System.out.println("m2 method");
            }
             catch(Exception e)
             {
                System.out.println("m3 method");
                 System.out.println(e);
             } 
            
      }
      void n()throws IOException
       {
              m();
        }
        void p()throws IOException
        {
                  System.out.println("p1 method");
               
                       n();
                  System.out.println("p2 method");
                
        }
        public static void main(String arg[])throws IOException
        {
              Throws1 obj=new Throws1();
               obj.p();
               System.out.println("normal flow");
        }
}