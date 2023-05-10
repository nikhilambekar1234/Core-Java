class Table
{
    synchronized static void printTable(int n)
    {
         for(int i=1;i<=5;i++)
         {
                System.out.println(n*i);
                try
                {
                     Thread.sleep(500);
                }
                catch(Exception e)
                {
                         
                }
         }
    }
}
class MyThread1 extends Thread
{
     public void run()
     {
          Table.printTable(1);
           
     }
}
class MyThread2 extends Thread
{
     public void run()
     {
          Table.printTable(10);
           
     }
}

public class TestSynchronization7 
{
       public static void main(String arg[])throws Exception
       {
                 MyThread1 t1=new MyThread1();
                 MyThread1 t2=new MyThread1();
               

                  t1.start();
                  t2.start();

                  MyThread2 t3=new MyThread2();
                 MyThread2 t4=new MyThread2();
               
                  t2.join();
                  t3.start();
                  t4.start();
                 
       } 
}