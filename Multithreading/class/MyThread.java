class MyThread extends Thread
{
    public void run()
    {
          System.out.println("shut down hook task completed");
    }
}
public class TestShutdown1
{
       public static void main(String arg[])throws Exception
       {
           Runtime r=Runtime.getRuntime();
           r.addShutdownHook(new MyThread());
           
           System.out.println("now main sleeping  press ctrl+c to exit");
            try
           {
                Thread.sleep(5000);        
           }
           catch(Exception e)
           {
                   System.out.println(e);
           }
             System.out.println("End code");
       }
}