public class ThreadGroupDemo1 extends Thread
//public class ThreadGroupDemo1 implements Runnable
{
     public void run()
    {
         System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().activeCount());
    }
    public static void main(String arg[])
    {
            ThreadGroupDemo1 r1=new ThreadGroupDemo1();
            
            ThreadGroup tg1= new ThreadGroup("Parent ThreadGroup");
 
              Thread t1=new Thread(tg1,r1,"one");
              t1.start();
              Thread t2=new Thread(tg1,r1,"two");
              t2.start();
              Thread t3=new Thread(tg1,r1,"three");
               t3.start();
             
             System.out.println("Thread Group Name  "+tg1.getName());
            
                // System.out.println("active group count "+tg1.activeCount());
             
            tg1.activeCount();
               tg1.list();
                tg1.destroy();
             tg1.activeCount();
              tg1.destroy();
             tg1.activeCount();
               
 /*
           ThreadGroup tg2= new ThreadGroup("Child ThreadGroup");
 
              Thread t4=new Thread(tg2,r1,"four");
              t4.start();
              Thread t5=new Thread(tg2,r1,"five");
              t5.start();
             Thread t6=new Thread(tg2,r1,"six");
               t6.start();

             System.out.println("Thread Group Name  "+tg2.getName());
             tg2.list();
             //System.out.println("active group count "+ThreadGroupDemo1.activeGroupCount());
              //ThreadGroupDemo1.activeGroupCount();
*/
    }
}