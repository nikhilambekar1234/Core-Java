//SINGLE
 class Employee
{
       float salary=4000;
}
class Programmer extends Employee
{
    int bonus=1000;
   
    public static void main(String arg[])
    {
          Programmer p=new Programmer();
          System.out.println(p.salary);
          System.out.println(p.bonus);
    }
}