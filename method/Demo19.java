//FUNCTION CALL
class Demo19
{
    int rev,rem,temp;
    static Demo19 d=new Demo19();
    public static void main(String args[])
    {
        d.odd();
    }
    void odd()
    { 
        int n=121;
        if(n%2!=0)
        { 
            System.out.println("odd num = "+n);
            d.rev(n);
        }
        
     }
     void rev(int n)
     {
         while(n!=0)
         {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
         }
         System.out.println("reverse = "+rev);
         d.palindrome(rev);
     }
     void palindrome(int n)
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
           System.out.println("palindrome num");
        }
        else 
        {
           System.out.println("Not palindrome num");
        }
     }
}