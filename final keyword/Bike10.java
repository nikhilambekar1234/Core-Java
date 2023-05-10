//final variable
class Bike10
{
         final int speedlimit=90;
         void run()
         {
              //speedlimit=400;    //redefine      //error=> redefine
                int speedlimit=500;  //locally declare
                
         }
         void fun()
        {
              System.out.println(speedlimit);
        }
         public static void main(String arg[])
         {
              Bike10 obj=new Bike10();
              
              obj.run();
              obj.fun();
         }
}