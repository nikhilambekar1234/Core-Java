class Thread1 extends Thread
{
      public void run()
      {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().activeCount());
       }
       public static void main(String arg[])
       {
             Thread1 th1=new Thread1();
              ThreadGroup tg1=new ThreadGroup("parent threadGroup");
 
              Thread t1=new Thread(tg1,th1,"one");
              t1.start();
              Thread t2=new Thread(tg1,th1,"two");
              t2.start();
              Thread t3=new Thread(tg1,th1,"three");
              t3.start();
             
               System.out.println("group name "+tg1.getName());
               
             //  tg1.activeCount();
               tg1.list();
             //  tg1.destroy();
             //  tg1.activeCount();



       }
}