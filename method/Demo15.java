//SWITCH CASE
import java.util.Scanner;
class Demo15
{
   static int n;
    void set(int a)
    {
       n=a;
    }
    public static void main(String args[])
    {
       int num;
        Demo15 d1=new Demo15();
       Scanner d=new Scanner(System.in);
       d1.set(121);
       System.out.println("enter num\n1-evenodd\n2-palindrome\n");
       num=d.nextInt();
       switch(num)
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
}