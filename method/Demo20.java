//RETURN
class Demo20
{
    static int n,rev,rem,temp;
    int odd()
    { 
        n=121;
        if(n%2!=0)
        {
           return n;
        }
        else
        {
            return 0;
        }
    }
    int reverse(int n)
    {
         while(n!=0)
         {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
         }
         return rev;
    }
    int palindrome(int n)
    {
        rev=0;
        temp=n;
        while(n!=0)
        {
          
           rem=n%10;
           rev=rev*10+rem;
           n=n/10;
        }
        if(temp==rev)
        {
           return 1;
        }
        else
        {
           return 0;
        }
     }
    public static void main(String args[])
    {
        Demo20 d=new Demo20();
        n=d.odd();
        if(n==0)
        {
        }
        else
        {
           System.out.println("odd num = "+n);
           rev=d.reverse(n);
           System.out.println("reverse = "+rev);
           n=d.palindrome(rev);
           if(n==1)
           {
           System.out.println("palindrome num");
           }
           else
           {
           System.out.println("Not palindrome num");
           }
       }
   }
} 