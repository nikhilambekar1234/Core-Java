//PRIME
class Demo1
{
   public static void main(String argv[])
 {
   int n=23,i,count=0;
   for(i=1;i<=n;i++)
   {
      if(n%i==0)
      {
         count++;
      }
   }
   if(count==2)
   {
      System.out.println("prime");
   }
   else
   {
     System.out.println("not prime");
   }
 }
}