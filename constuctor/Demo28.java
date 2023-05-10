//WITH CONSTRUCTOR
class Demo28
{
   int a;
   Demo28()
   {
      a=10;
   }
   Demo28(Demo28 c)    //WITH CONSTRUCTOR
   {
      System.out.println(a); // 0
      System.out.println(c.a); // 10
   }
   public static void main(String a[])
   {
      Demo28 d=new Demo28();
      Demo28 d1=new Demo28(d);
   }
}
