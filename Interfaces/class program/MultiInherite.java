interface Printable
{
     void print();
}
interface Likable extends Printable
{
     void like();
}
interface Showable
{
     void show();
}
class MultiInherite implements Likable,Showable
{
       public void print()
      {
           System.out.println("print method");
      }
       public void show()
      {
           System.out.println("show method");
      }
      public void like()
      {
           System.out.println("like method");
      }
      public static void main(String arg[])
      {
          MultiInherite obj=new MultiInherite();
          obj.print();
          obj.show();
          obj.print();

           Likable obj1=new MultiInherite();
           obj1.print();
           obj1.like();
         
      }
}