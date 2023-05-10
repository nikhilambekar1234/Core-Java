class Bank
{
      int getRateOfInterest()
      {
               return 0;
      }
}
class SBI extends Bank
{
       int getRateOfInterest()
       {
              return 8;
       }      
}
class ICICI extends Bank
{
       int getRateOfInterest()
       {
              return 7;
       }      
}
class AXIS extends Bank
{
       int getRateOfInterest()
       {
              return 9;
       }      
}
class Test2
{
       public static void main(String arg[])
       {
             SBI s=new SBI();
             System.out.println(s.getRateOfInterest());

            ICICI i=new ICICI();
            System.out.println( i.getRateOfInterest());
               
            AXIS a=new AXIS();
             System.out.println(a.getRateOfInterest());
       }
}