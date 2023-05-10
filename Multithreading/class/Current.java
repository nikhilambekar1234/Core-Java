class Current extends Thread
{
       public void run()
       {
          
                     System.out.println("Your thread name = "+Thread.currentThread().getName());
                    
       }
       public static void main(String arg[])
       {
               System.out.println("Your thread name = "+Thread.currentThread().getName());
               Current t1=new  Current();
               Current t2=new  Current();
               t1.setName("nikhil");
              t1.start();
              t2.setName("jain");
              t2.start();
       }
}