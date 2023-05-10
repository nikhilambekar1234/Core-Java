//SINGLE
 class Employee1
{
       void get()
      {
          float salary=4000;
           System.out.println(salary);
      }
}
class Programmer1 extends Employee1
{
   void set()
    {
        int bonus=1000;
        System.out.println(bonus);
   }
    public static void main(String arg[])
    {
          Programmer1 p=new Programmer1();
          p.get();
          p.set();
    }
}