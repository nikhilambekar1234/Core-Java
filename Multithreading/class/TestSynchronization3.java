class Table
{
     synchronized void printTable(int n)
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
                         System.out.println(e);
                    }
              }
     }
}
class MyThread1  extends Table   implements Runnable
{
      
       
       public void run()
       {
            super.printTable(5);
       }
}
class MyThread2 extends MyThread1 implements Runnable
{
      
       public void run()
       {
             super.printTable(100);
       }
}
public class TestSynchronization3
{
      public static void main(String arg[])
      {
           
            Thread t1=new Thread(new MyThread1());
            Thread t2=new Thread(new MyThread2()); 

            t1.start();
            t2.start();
      }
}