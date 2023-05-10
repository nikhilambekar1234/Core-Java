// FUNCTION CALL BY SWITCH CASE
import java.util.Scanner;
class Demo14
{
    int n;
    void set(int a)
    {
       n=a;
    }
    void evenodd()
    {
       if(n%2==0)
       {
           System.out.println("Given num is even = "+n);
       }
       else
       {
           System.out.println("Given num is odd = "+n);
       }
    }
    void palindrome()
    {
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
    }
    public static void main(String args[])
    {
       int num;
        Demo14 d1=new Demo14();
       Scanner d=new Scanner(System.in);
       d1.set(121);
       System.out.println("enter num\n1-evenodd\n2-palindrome\n");
       num=d.nextInt();
       switch(num)
       {
          case 1:
                d1.evenodd();
                break;
         
          case 2:
                d1.palindrome();
                break;

          default:
                 System.out.println("invalid num");
               
       }
       
    }
}