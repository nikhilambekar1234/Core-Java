//+ OPERATOR ACCESS INSTANCE AND LOCAL VARIABLE
 class Rectangle1
{
   int b;  
   int get()
  {
     int a;
     a=10;
     b=20;
     return a;
  }
  void set()
  {
     int p=get();
     System.out.println(p);        //LOCAL VARIABLE BY RETURN
     System.out.println(b);
     System.out.println(10+20+"hello"+(10+20));
     System.out.println(10+20+"hello"+10+20);
  }
  public static void main(String arg[])  
  {
     Rectangle1 r1=new Rectangle1();
     r1.set();
     
     
  }
}
