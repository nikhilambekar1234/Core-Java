interface printable
{
     void print();
}
class A6 implements printable
{
      public void print()
      {
           System.out.println("Hello");
      }
      public static void main(String arg[])
      {
           A6 obj=new A6();
          obj.print();
          printable obj1=new A6();
          obj1.print();
      }
}