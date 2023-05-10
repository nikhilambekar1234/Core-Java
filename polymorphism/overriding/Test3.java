class Parent
{
       void gun()
      {
               
               System.out.println("Run gun");
      }
      void run()
      {
               gun();
               System.out.println("Run parent");
      }
}
class child extends Parent
{
        void run()
      {
               
             //Parent p=new Parent();
            // p.run();
               super.run();
               System.out.println("Run child");
      }
}

class Test3
{
       public static void main(String arg[])
       {
             child c=new child();
             c.run();

            
       }
}