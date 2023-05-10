class Join4 extends Thread
{
   public void run()
   {
       for(int  i=1;i<=5;i++)
       { 
              try
              {
                   Thread.sleep(1500);
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
           Join4 t1=new Join4();
           Join4 t2=new Join4();
           Join4 t3=new Join4();
     
          t1.start();
         try
         {
              t1.join(500);
         }
         catch(Exception e)
         {
               System.out.println(e);
         }
         t2.start();
          t3.start();
        

    }
   
}