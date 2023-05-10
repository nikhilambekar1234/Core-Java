abstract class Area1
{
        abstract void area(int s);
}
class Square1 extends Area1
{
      
        void area(int s)
        {
                System.out.println(s*s);
        }
}

class Abstraction1
{
       public static void main(String arg[])
       {
              Area1 a1=new Square1();
            

             a1.area(5);
          
              
       }
}