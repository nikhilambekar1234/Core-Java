class Table
{
    synchronized  void printTable(int n)
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
      Table t;
       MyThread1(Table t)
       {
            this.t=t;
       }
     public void run()
     {
         t.printTable(1);
           
     }
}
class MyThread2 extends Thread
{
      Table t;
       MyThread2(Table t)
       {
            this.t=t;
       }
     public void run()
     {
          t.printTable(10);
           
     }
}
class MyThread3 extends Thread
{
      Table t;
       MyThread3(Table t)
       {
            this.t=t;
       }
     public void run()
     {
          t.printTable(100);
           
     }
}
class MyThread4 extends Thread
{
      Table t;
       MyThread4(Table t)
       {
            this.t=t;
       }
     public void run()
     {
          t.printTable(1000);
           
     }
}
public class TestSynchronization10
{
       public static void main(String arg[])throws Exception
       {
                 Table obj=new Table();
                 MyThread1 t1=new MyThread1(obj);
                 MyThread2 t2=new MyThread2(obj);
                 MyThread3 t3=new MyThread3(obj);
                 MyThread4 t4=new MyThread4(obj);

                  t1.start();
                t1.join();
                  t2.start();
                  t2.join();
                  t3.start();
                  t3.join();
                  t4.start();
       } 
}