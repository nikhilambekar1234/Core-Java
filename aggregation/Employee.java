class Address
{
        String place(String area)
        {
                   return area;
        }
}
class Employee
{
     Address op;//agreation
     String name;
    
    void Inform(String n)
    {
        op=new Address();
        String rplace=op.place("pune");//code reusability(delegate the method call)
         name=n;
         System.out.println(name+"  "+rplace);
       // return pi*rsquare;
    } 
    public static void main(String arg[])
   {
          
         Employee c=new Employee();
         c.Inform("nik");
        // double result=c.Inform("nik");
       //  System.out.println(result);
         
   }    
}