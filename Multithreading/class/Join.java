class Join extends Thread
{
   public void run()
   {
       for(int  i=1;i<=5;i++)
       {
              try
              {
                   Thread.sleep(1000);
              }
              catch(Exception e)
              {
                 System.out.println(e);
              }
              System.out.println(i);
       }
    }
    public static void main(String arg[])
    { 
           Join t1=new Join();
           Join t2=new Join();
           Join t3=new Join();
     
          t1.start();
          t2.start();
         try
         {
              t1.join();
              t2.join();
         }
         catch(Exception e)
         {
               System.out.println(e);
         }
         // t2.start();
          t3.start();
        

    }
   
}