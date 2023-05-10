//INITILIZER BLOCK
class Demo6
{
       
        Demo6()
      {
            System.out.println("Demo6 default");
       }
       
       {
              System.out.println("Demo6 initializer");
       }
}
class Demo7 extends Demo6
{
       
        Demo7()
      {
            System.out.println("Demo7 default");
       }
       {
              System.out.println("Demo7 initializer");
       }
        public static void main(String arg[])
       {
               Demo7 d=new Demo7();
       }
}
       