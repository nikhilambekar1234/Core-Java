//2) THIS CAN BE USED TO INVOKED CURRENT CLASS METHOD (IMPLICITLY).
class InvokeMethod
{
    void display()
    {
        System.out.println("hiii");
    }
    void show()
   {    
   //   this.get();                         implicitly use by compiler
         display();
         System.out.println("Hello");
   }
   public static void main(String arg[])
  {
      InvokeMethod d1=new InvokeMethod();
     d1.show();
   }
}
