/*As you can see in the above example, printing s1 and s2 prints the hashcode values of the objects but I want to print the values of these objects.
 Since java compiler internally calls toString() method, overriding this method will return the specified values. 
*/
class WithoutToString
{
      int rollno;
      String name;
      String city;

      WithoutToString(int rollno,String name,String city)
      {
              this.rollno=rollno;
              this.name=name;
              this.city=city;
      }
      public static void main(String arg[])
      {
           WithoutToString s1=new WithoutToString(101,"Raj","Lucknow");
           WithoutToString s2=new WithoutToString(102,"Vijay","Gaziabad");

            System.out.println(s1);//compiler writes here s1.toString()  
            System.out.println(s2);//compiler writes here s2.toString()  
      }
}