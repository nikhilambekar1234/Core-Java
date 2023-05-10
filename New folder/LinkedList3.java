import java.util.*;
class LinkedList3
{
    public static void main(String arg[])
    {
           LinkedList<String> al=new LinkedList<String>();
            al.add("Ravi");
            al.add("Vijay");
            al.add("Ravi");
            al.add("Ajay");

            LinkedList<String> al2=new LinkedList<String>();
            al2.add("Sonu");
            al2.add("Monu");
    
            al.addAll(al2);

            Iterator<String> itr=al.iterator();
            while(itr.hasNext())
            {
                 System.out.println(itr.next());
            }
    }
}