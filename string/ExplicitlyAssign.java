/*Why string objects are immutable in java?
Because java uses the concept of string literal. Suppose there are 5 reference variables, all referes to one object "sachin". 
If one reference variable changes the value of the object, it will be affected to all the reference variables. That is why string objects are immutable in java.
*/
class ExplicitlyAssign
{
   public static void main(String arg[])
  {
        String s="java";
        String s1="welcome";

       s1=s1.concat(s);
	   //  s1=s1.concat("java");

       System.out.println(s1);
   }
}