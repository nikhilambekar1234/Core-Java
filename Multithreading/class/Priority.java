class Priority1 extends Thread
{
       public void run()
       {
          
                    System.out.println("Your thread name = "+Thread.currentThread().getName());
                    System.out.println("Your thread Priority = "+Thread.currentThread().getPriority());

                 //    System.out.println("Your thread name = "+Thread.currentThread().getName()+"   "+Thread.currentThread().getPriority());
                    
       }
}
class Priority extends Thread
{
       public void run()
       {
          
                    System.out.println("Your thread name = "+Thread.currentThread().getName());
                    System.out.println("Your thread Priority = "+Thread.currentThread().getPriority());
								
		 				 
                 //    System.out.println("Your thread name = "+Thread.currentThread().getName()+"   "+Thread.currentThread().getPriority());
                    
       }
       public static void main(String arg[])
       {
                 System.out.println("Your thread name = "+Thread.currentThread().getName()+"   "+Thread.currentThread().getPriority());
            //   System.out.println("Your thread name = "+Thread.currentThread().getName());
               Priority t1=new  Priority();
               Priority t2=new  Priority();
                Priority t3=new  Priority();
                Priority t4=new  Priority();
              t1.setName("nikhil");
             //t1.start();
            t2.setName("jain");
           //   t2.start();
             
            
              t1.setPriority(Thread.MIN_PRIORITY);
              t2.setPriority(Thread.MAX_PRIORITY);
              t3.setPriority(9);
               t4.setPriority(2);
 
              t1.start();
              t2.start();
               t3.start();
               t4.start();

                Priority1 m1=new  Priority1();
               Priority1 m2=new  Priority1();
                Priority1 m3=new  Priority1();
               Priority1 m4=new  Priority1();

               m1.setPriority(3);
              m2.setPriority(8);
              m3.setPriority(2);
             m4.setPriority(4);

               m1.start();
              m2.start();
               m3.start();
               m4.start();
       }
}