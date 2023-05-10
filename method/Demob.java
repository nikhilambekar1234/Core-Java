//CALL WITHOUT OBJECT FOR STATIC METHOD
class Demoa
{
 
   public static void main(String a[])
   {
       System.out.println("hello");
   }
}
class Demob
{
   public static void main(String b[])
   {
      Demoa.main(null);
      System.out.println("hii");
   }
    
}