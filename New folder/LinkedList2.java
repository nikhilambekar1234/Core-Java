import java.util.*;
class LinkedList2
{
    public static void main(String arg[])
    {
           LinkedList al=new LinkedList();
            al.add("Ravi");
            al.add("Vijay");
            al.add("Ravi");
            al.add(12);
    
            Iterator itr=al.iterator();
            while(itr.hasNext())
            {
                 System.out.println(itr.next());
            }
    }
}