//"this" USE AS AN ARGUMENT IN METHOD CALL
class Demo34
{
    void get (Demo34 d2)
    {
        System.out.println("hiii");
    }
     void set ()
    {
        get(this);
    }
   public static void main(String arg[])
  {
      Demo34 d1=new Demo34();
     d1.set();
   }
}
   