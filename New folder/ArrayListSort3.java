import java.util.*;
class ArrayListSort3
{
      public static void main(String arg[])
      {
            ArrayList<String>al=new ArrayList<String>();
            al.add("Amit");
            al.add("Ravi");
            al.add("Vijay");
            al.add("Rahul");
          
            Collections.sort(al);
            //Collections.sort(al,Collections.reverseOrder());
            Iterator itr=al.iterator();
           while(itr.hasNext())
            {
                 System.out.println(itr.next());
            }
      }
}