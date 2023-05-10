/*Immutable String in Java
In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
Once string object is created its data or state can't be changed but a new string object is created.
*/
class Immutable
{
   public static void main(String arg[])
  {
        String s="java";
        String s1="welcome";

       s.concat(s1);   //concat() method appends the string at the end  

       System.out.println(s);    //will print java because strings are immutable objects  
   }
}