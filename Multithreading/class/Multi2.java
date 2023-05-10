class Multi2 extends Thread
{
       public void run()
       {
          //  System.out.println("thread is running");
              for(int i=1;i<=5;i++)
              {
                   
                          System.out.println(i);
                    
              }
       }
       public static void main(String arg[])
       {
              Multi2 t1=new Multi2();
              t1.start();
              t1.start();
       }
}