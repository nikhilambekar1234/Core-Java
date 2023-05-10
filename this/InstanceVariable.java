//1) THE THIS KEYWORD CAN BE USED TO REFER CURRENT CLASS INSTANCE VARIABLE.
class InstanceVariable
{
    int a;
    void get (int a)
    {
        this.a=a;
    }
    void display()
   {
         System.out.println(a);
   }
   public static void main(String arg[])
  {
        InstanceVariable d=new InstanceVariable();
       d.get(4);
       d.display();
  }
}