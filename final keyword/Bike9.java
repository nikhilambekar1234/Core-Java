//final variable
class Bike9
{
         final int speedlimit=90;
         void run()
         {
               //speedlimit=400;    //redefine
              int speedlimit=500;  //locally declare
                System.out.println(speedlimit);
         }
         public static void main(String arg[])
         {
              Bike9 obj=new Bike9();
              obj.run();
         }
}