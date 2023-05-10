abstract class Bike
{
           abstract void run();
           void get()
           {
                   System.out.println("not abstract get method");
           }
}
class Honda4 extends Bike
{
         void run()
         {
                System.out.println("abstract run method");
         }
         public static void main(String arg[])
         {
                Bike obj=new Honda4();
                obj.run();
                obj.get();
         }
      
}