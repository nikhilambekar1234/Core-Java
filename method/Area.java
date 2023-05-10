//METHO CALL
class Area
{
   double pii=3.14;
   int a;
   int b;

   void get(int c,int d)
   {
      a=c;
      b=d;
   }
   void areaCircle()
  {
     double area;
     area=pii*a*a;
     System.out.println(+area);
  }
  void areaRect()
  {
     int area;
     area=a*b;
     System.out.println(+area);
  }
  void areaSqua()
  {
     int area;
     area=a*a;
     System.out.println(+area);
  }
  public static void main(String args[])
  {
      Area a1=new Area();
      Area a2=new Area();

      a1.get(4,8);
      a2.get(5,10);

      a1.areaCircle();
      a2.areaCircle();
      
     a1.areaRect();
      a2.areaRect();

     a1.areaSqua();
      a2.areaSqua();
  }

}