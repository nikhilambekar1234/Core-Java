//RETURN
class Demo21
{
   int n,rem,rev,temp;
   int odd()
   {
      n=122;
      if(n%2!=0)
      {
          return n;
      }
      else 
      {
         return 0;
      }

   }
   int reverse()
   {
     n=odd();
     while(n!=0)
     {
      rem=n%10;
      rev=rev*10+rem;
      n=n/10;
      
    }
     return rev;
   }
   int palindrome()
   {
       n=reverse();
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
     Demo21 d=new Demo21();
     int result =d.palindrome();
     if(result==1)
     {
        System.out.println("palindrome num");
     }
     else
     {
         System.out.println("Not palindrome num");
     }
   }
}