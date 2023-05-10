 class Area
{
    
      //double pi=3.14;
     double s;
      double areaa;
      
      double area(double s)
      {
             this.s=s;
              System.out.println(s);
               return s;
      }
}
class Circle extends Area
{    
       double area()
       {
              Area p=new Area();
              double a=p.area(4);
             
           //  double a=super.area();
               areaa=3.14*a*a;
              return areaa;
       }      
}
class Square extends Area
{    
       double area()
       {
              areaa=5*5;
              return areaa;
       }      
}
class Test4
{
       public static void main(String arg[])
       {
             
            
            
             Circle a1=new Circle();
             System.out.println(a1.area());

            Square a2=new Square();
            System.out.println(a2.area());
       }
}