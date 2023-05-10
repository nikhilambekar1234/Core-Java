import java.util.*;
class Test
{
       public static void main(String arg[])
       {
              ArrayList<String> al= new ArrayList<String>();
               al.add("Ravi");
               al.add("c");
               al.add("Nikhil");
               al.add("Sonu");

               Iterator itr=al.iterator();
               while(itr.hasNext())
               {
                    
                    System.out.println(itr.next());
               }
       }
}