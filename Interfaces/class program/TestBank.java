abstract class Bank
{
      abstract int getRateOfInterest();
}
class SBI extends Bank
{
       int getRateOfInterest()
      {
           return 7;
      }
}
class PNB extends Bank
{
       int getRateOfInterest()
      {
           return 9;
      }
}
class TestBank
{
       public static void main(String arg[])
       {
            Bank c=new SBI();
            int interest=c.getRateOfInterest();
            System.out.println("Rate of Interest is = "+interest+" %");
       }
}