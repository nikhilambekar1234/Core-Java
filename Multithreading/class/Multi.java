class Multi extends Thread
{
       public void run()
       {
          //  System.out.println("thread is running");
              for(int i=1;i<=10;i++)
              {
                     System.out.println(i);
                     try
                     {
                          Thread.sleep(3000);
                     }
                     catch(InterruptedException e)
                     {
                          System.out.println(e);
                     }
              }
       }
       public static void main(String arg[])
       {
              Multi t1=new Multi();
              Multi t2=new Multi();
              t1.start();
              t2.start();
       }
}