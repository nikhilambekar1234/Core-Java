import java.util.*;
class Test6
{
       public static void main(String arg[])
       {  
               
              ArrayList<String> al= new ArrayList<String>();
               al.add("Ravi");
               al.add("c");
               al.add("Nikhil");
               al.add("Sonu");

               
               for(String obj : al)
               {
                    
                    System.out.println(obj);
               }
               ArrayList<String> al2= new ArrayList<String>();
               al2.add("Ravi");
               al2.add("c");
   
               al.addAll(al2);
                for(String obj : al)
               {
                    
                    System.out.println(obj);
               }
               
       }
}