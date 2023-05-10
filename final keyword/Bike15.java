//final class
 final class Bike14
{
         // final void run()//final method inherited but can not override
          void fun()
         {
               
                System.out.println("final method Bike11");
         }
        
}
 class Bike16 extends Bike14
{
          void run()
         {
               
                System.out.println("final method Bike16");
         }
        
}
class Bike15 extends Bike16
{
          void gun()
         {
               
                System.out.println( "method Bike12");
         }
         public static void main(String arg[])
         {
              Bike15 obj=new Bike15();
              obj.run();
             
         }
}