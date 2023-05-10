import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
      YoungerAgeException(String msg)
       {
              super(msg);
       }
}
class CustomException5
{
     public static void main(String arg[])
     {
             Scanner s=new Scanner(System.in);
             System.out.println("enter your age");
             int age=s.nextInt();
             try
             {
                      if(age<18)
                      {
                          throw new YoungerAgeException("you are not eligible for vote");
                      }
                      else
                      {
                             System.out.println("you are eligible for vote");
                      }
             }
             catch(YoungerAgeException e)
             {
                   e.printStackTrace();
             }
             System.out.println("hello");
     }
}