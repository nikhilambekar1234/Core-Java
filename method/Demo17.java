// PALINDROME
class Demo17
{ 
   static int rev=0,rem,temp;
   public static void main(String args[])
    {   int n=123;
        if(n%2!=0)
        {
            System.out.println("ODD = "+n);
            temp=n;
            while(n!=0)
            {
               rem=n%10;
               rev=rev*10+rem;
               n=n/10;
            }
            System.out.println(rev);
            n=rev;
            temp=n;
            while(n!=0)
            {
               rem=n%10;
               rev=rev*10+rem;
               n=n/10;
            }
            System.out.println(rev);
            if(temp==rev)
            {
                System.out.println("Given num is palindrome = "+temp);
            }
            else
            {
               System.out.println("Given num is not palindrome = "+temp);
            }
         }
    }
}