class Operation
{
        int square(int n)
        {
                   return n*n;
        }
}
class Circle
{
    Operation op;//agreation
    double pi=3.14;
    
    double area(int radius)
    {
        op=new Operation();
        int rsquare=op.square(radius);//code reusability(delegate the method call)
    
        return pi*rsquare;
    } 
    public static void main(String arg[])
   {
          
         Circle c=new Circle();
         double result=c.area(5);
         System.out.println(result);
         
   }    
}