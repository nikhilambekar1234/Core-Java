class Thread2 extends Thread
{
      public void run()
      {
     
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().activeCount());
              
       }
       public static void main(String arg[])
       {
             Thread2 th1=new Thread2();
              ThreadGroup tg1=new ThreadGroup("nikhil threadGroup");
             
              Thread t1=new Thread(tg1,th1,"one");
              t1.start();
            
              Thread t2=new Thread(tg1,th1,"two");
               t2.interrupt();
              t2.start();
              
              Thread t3=new Thread(tg1,th1,"three");
              t3.start();
               
      /*       
               System.out.println("group name "+tg1.getName());
           //     System.out.println("thread count=  "+tg1.activeCount());
                   System.out.println("parent of nikhil thread group "+tg1.getName()+"  is child of  "+tg1.getParent().getName());
            
              
             //  tg1.activeCount();
               tg1.list();
               tg1.destroy();
               
         */      



       }
}