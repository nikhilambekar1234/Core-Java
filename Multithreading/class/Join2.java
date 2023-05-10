class Join1 extends Thread
{
   public void run()
   {
       for(int  i=1;i<=5;i++)
       {
              try
              {
                   Thread.sleep(500);
              }
              catch(Exception e)
              {
                 System.out.println(e);
              }
              System.out.println(i);
       }
    }
}
class Join2 extends Thread
{
   public void run()
   {
       for(int  i=6;i<=10;i++)
       {
              try
              {
                   Thread.sleep(500);
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
           Join1 t1=new Join1();
           Join1 t2=new Join1();
           Join1 t3=new Join1();

           Join2 th1=new Join2();
           Join2 th2=new Join2();
          Join2 th3=new Join2();
     
          t1.start();
         try
         {
              t1.join();
         }
         catch(Exception e)
         {
               System.out.println(e);
         }
          t2.start();
          t3.start();
         try
         {
              t3.join();
         }
         catch(Exception e)
         {
               System.out.println(e);
         }

          th1.start();
          
         try
         {
              th1.join();
         }
         catch(Exception e)
         {
               System.out.println(e);
         }
          th2.start();
         th3.start();

    }
   
}