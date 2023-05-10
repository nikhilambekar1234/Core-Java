////INITILIZER BLOCKS
class Demo4
{
       
        Demo4()
      {
            System.out.println("Demo4 default");
       }
       Demo4(int a)
       {
              System.out.println("Demo4 para");
       }
}
class Demo5 extends Demo4
{
       
        Demo5()
      {
            System.out.println("Demo5 default");
       }
       Demo5(int b)
       {
              System.out.println("Demo5 para");
       }
        public static void main(String arg[])
       {
               Demo5 d=new Demo5(4);
       }
}
       