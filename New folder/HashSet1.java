import java.util.*;  
class HashSet1
{  
public static void main(String args[])
{  

   HashSet<String> al=new HashSet<String>();  
   al.add("Ravi");  
   al.add("Vijay");  
   al.add("Ravi");  
  al.add("Sonu");
  // al.add(1,"Ajay");  

   Iterator<String> itr=al.iterator();  
   while(itr.hasNext())
  {  
      System.out.println(itr.next());  
   }  
}  
}  


