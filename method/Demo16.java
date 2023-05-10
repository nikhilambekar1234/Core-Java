//SWITCH CASE
import java.util.Scanner;
class Demo16
{
    int n=121;
    void get(int a)
    {
       switch(a)
       {
             case 1:
                     if(n%2==0)
                     {
                        System.out.println("Given num is even = "+n);
                     }
                     else
                     {
                         System.out.println("Given num is odd = "+n);
                     }
                    break;
            case 2:
                   int rev=0;
                   int rem,temp;
                   temp=n;
                   while(n!=0)
                   {
                    rem=n%10;
                    rev=rev*10+rem;
                    n=n/10;
                   }
                  if(temp==rev)
                  {
                      System.out.println("Given num is palindrome = "+temp);
                  }
                  else
                  {
                      System.out.println("Given num is not palindrome = "+temp);
                  }
                  break;
            default:
                 System.out.println("invalid num");
       }
    }
    public static void main(String args[])
    { Demo16 d1=new Demo16();
      d1.get(2);
    }
}