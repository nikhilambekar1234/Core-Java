abstract class Parent
{
         //  int a;
           abstract void run();
           void set()
           {
                   System.out.println("not abstract set method");
           }

        //   Parent();
           
}
 class Child extends Parent
{
            void run()
           {
                   System.out.println(" abstract run method");
           }
}

class Main 
{
         
        
         public static void main(String arg[])
         {
                Main obj=new Main();
               // obj.set();
                  obj.run();
                
         }
      
}