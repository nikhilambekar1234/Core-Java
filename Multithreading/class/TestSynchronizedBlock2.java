class Table
{
      void printTable(int n)
      {
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");
            System.out.println("statement 4");
            synchronized(this)
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
            System.out.println("statement 5");
            System.out.println("statement 6");
            System.out.println("statement 7");
            System.out.println("statement 8");
      }
}
public class TestSynchronizedBlock2
{
         public static void main(String arg[])
         {
               final Table obj=new Table();

              Thread t1=new Thread()
               {
                    public void run()
                    {
                         obj.printTable(5);
                    }
               };

               Thread t2=new Thread()
               {
                    public void run()
                    {
                         obj.printTable(100);
                    }
               };
               t1.start();
               t2.start();
         }
}