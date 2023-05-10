class Multi extends Thread
{
       public void run()
       {
          //  System.out.println("thread is running");
              for(int i=1;i<=5;i++)
              {
                     System.out.println(i);
             }
       }
}
class Multi1 extends Multi
{
       public void run()
       {
          //  System.out.println("thread is running");
              for(int i=6;i<=10;i++)
              {
                     System.out.println(i);
             }
       }
       public static void main(String arg[])
       {
              Multi t1=new Multi();
              t1.start();
             
              Multi1 t2=new Multi1();
              t2.start();
             
       }

}
       