import java.util.*;
class ArrrayListSort3
{
      public static void main(String arg[])
      {
            ArrrayList<String>al=new ArrrayList<String>();
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