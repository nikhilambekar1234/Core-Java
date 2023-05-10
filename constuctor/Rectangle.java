//MULTIPLE OBJECT BY COMMA
 class Rectangle
{
   int length,width;  
   Rectangle(int l,int w)
  {
     length=l;
     width=w;
  }
  void area()
  {
     int Area=length*width;
     
     System.out.println("Area of rectangle = "+Area);
  }
  public static void main(String arg[])
  {
     Rectangle r1=new Rectangle(2,4),r2=new Rectangle(3,5);
     r1.area();
     r2.area();
  }
}
