/*Java toString() method
If you want to represent any object as a string, toString() method comes into existence.
The toString() method returns the string representation of the object.
If you print any object, java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output,
 it can be the state of an object etc. depends on your implementation.
Advantage of Java toString() method
By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.
*/
class WithToString
{
      int rollno;
      String name;
      String city;

      WithToString(int rollno,String name,String city)
      {
              this.rollno=rollno;
              this.name=name;
              this.city=city;
      }
      public String toString()
      {
            return rollno+"  "+name+"  "+city;
      }
      public static void main(String arg[])
      {
           WithToString s1=new WithToString(101,"Raj","Lucknow");
           WithToString s2=new WithToString(102,"Vijay","Gaziabad");

            System.out.println(s1);//compiler writes here s1.toString()  
            System.out.println(s2);//compiler writes here s2.toString()  
      }
}