//final method
class Bike11
{
         final void run()
         {
               
                System.out.println("final method Bike11");
         }
        
}
class Bike13 extends Bike11
{
          void run()
         {
               
                System.out.println("final method Bike13");
         }
        
}
class Bike12 extends Bike13
{
          void run()
         {
               
                System.out.println( "method Bike12");
         }
         public static void main(String arg[])
         {
              Bike12 obj=new Bike12();
              obj.run();
             //  Bike13 obj1=new Bike12();
               // obj1.run();
         }
}