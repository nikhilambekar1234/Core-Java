import java.util.*;
class LinkedList1
{
    public static void main(String arg[])
    {
           LinkedList<String> al=new LinkedList<String>();
            al.add("Ravi");
            al.add("Vijay");
            al.add("Ravi");
            al.add(12);
    
            Iterator<String> itr=al.iterator();
            while(itr.hasNext())
            {
                 System.out.println(itr.next());
            }
    }
}