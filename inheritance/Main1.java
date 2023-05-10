//MULTILEVEL
 class Employee2
{
       void get()
      {
          float salary=4000;
           System.out.println(salary);
      }
}
 class Programmer3 extends Employee2
{
       void net()
      {
          String name="IT";
           System.out.println(name);
      }
}
class Programmer2 extends Programmer3
{
   void set()
    {
        int bonus=1000;
        System.out.println(bonus);
   }
   
}
class Main1
{
       public static void main(String arg[])
    {
          Programmer2 p1=new Programmer2();
      
          p1.get();
          p1.set();
          p1.net();
         
    }
}