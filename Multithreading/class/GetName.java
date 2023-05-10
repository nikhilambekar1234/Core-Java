class GetName extends Thread
{
    public  void run()
      {
             System.out.println("running");
      }
      public static void main(String arg[])
      {
            GetName t1=new GetName();
            GetName t2=new GetName();

          System.out.println("Name of t1 "+t1.getName());
          System.out.println("Name of t2 "+t2.getName());

            //System.out.println("id of t1 "+t1.getId());
                 
            t1.start();
            t2.start();
         
            t1.setName("Nikhil");
             t2.setId(50);
            System.out.println("after changing Name of t1 "+t1.getName());
            System.out.println("after changing Id of t2 "+t2.getId());
      }
}