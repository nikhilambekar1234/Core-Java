//PASS OBJECT VALUE TO ANOTHER OBJECT
class Demo25
{
    int a;
    Demo25(int n)
   {
        a=n;
   }
   void display()
   {
       System.out.println(a);
   }
   public static void main(String arg[])
  {
       Demo25 d=new Demo25(10);
       Demo25 d1=new Demo25(20);
       d.display();
       d1.display();
       d1.a=d.a;           //pass object value to another object
       d.display();
       d1.display();
  }
}
