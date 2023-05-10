abstract class Area
{
        abstract void area();
        abstract void perimeter();
}
class Square extends Area
{
       int s=5;
        void area()
        {
                System.out.println(s*s);
        }
        void perimeter()
        {
                System.out.println(4*s);
        }
         
        
}
class Circle extends Area
{
        int r=10;
        void area()
        {
                System.out.println(3.14*r*r);
        }
        void perimeter()
        {
                System.out.println(2*3.14*r);
        }
}
class Rectangle extends Area
{
       int l=4,b=8;
        void area()
        {
                System.out.println(l*b);
        }
        void perimeter()
        {
                System.out.println(2*(l+b));
        }
}
class Abstraction
{
       public static void main(String arg[])
       {
              Area a1=new Square();
            Area a2=new Circle();
            Area a3=new Rectangle();

             a1.area();
            a2.area();
           a3.area();
           a2.perimeter();
              
       }
}