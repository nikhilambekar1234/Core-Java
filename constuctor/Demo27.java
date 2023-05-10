//WITH AND WITHOUT PARAMETER CONSTRUCTOR
class Demo27
{
   
   Demo27()
   {
     System.out.println("hello");
   }
   Demo27(int a)
   {
     System.out.println("hii");
   }
   public static void main(String a[])
  {
     Demo27 d=new Demo27();
     Demo27 d1=new Demo27(4);
  }
}