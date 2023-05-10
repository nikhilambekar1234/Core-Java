//UPCASTING/DOWNCASTING
class Bike
{
         void gun()
         {
                System.out.println("gun method Bike");
         }
         void run()
         {
                System.out.println("run method Bike");
         }
}
class Splender extends Bike
{
        void run()
        {
              //   super.run();
                 System.out.println("run method Splender");
        }
        void fun()
        {
                 System.out.println("fun method Splender");
        }
      
        public static void main(String arg[])
        {
              Bike b=new Splender();  //upcasting allowed
              System.out.println(b instanceof Splender );               //instanceof   => to find current class         
          
              b.run();
          // b.fun();        //not access
               b.gun();   //access

          //  Splender b1=new Bike();        //downcasting not allowed
            
        }
}