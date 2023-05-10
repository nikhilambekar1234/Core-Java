class  TestSleep1 extends Thread
{
      public void run()
      {
            for(int i=1;i<=5;i++)
            {
                    try
                    {
                          Thread.sleep(500);

                     }
                     catch(InterruptedException e)
                     {
                             System.out.println(e);
                     }
                     System.out.println(i);
             }
      }
}
class  TestSleep2 extends Thread
{
      public void run()
      {
            for(int i=6;i<=10;i++)
            {
                    try
                    {
                          Thread.sleep(1000);

                     }
                     catch(InterruptedException e)
                     {
                             System.out.println(e);
                     }
                     System.out.println(i);
             }
      }
        public static void main(String arg[])
       {
              TestSleep1 t1=new TestSleep1();
               TestSleep2 t2=new TestSleep2();

               
         //     t1.start();
           //    t1.start();    // illegeal Exception

                   t1.start();   //  each stack create for each thread
                   t2.start();   //  each stack create for each thread

                 //    t1.run();  //only one statck created for multiple run method 
                 //    t2.run();
                
       }
}
      

