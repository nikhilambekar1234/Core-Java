//"this"USE AS A CONSTRUCTOR
class Demo24
{
   int r,a=10,b=20,sum;
   double pii=3.14,area;
   Demo24()
   {
        this("k");
     
    }
   Demo24(String m)
   {  
        this(12);

    }
    Demo24(int r)
   {
          this.r=r;
          area= 2*pii*r;
          display();
          System.out.println("Hello");
    }
   void display()
   {
      System.out.println("Area of circle = "+area);
   }
   public static void main(String arg[])
   {
        Demo24 d = new Demo24();
    }
}