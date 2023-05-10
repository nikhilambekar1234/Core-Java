import java.util.*;
class HashMap3
{
      public static void main(String arg[])
      {
            HashMap<Integer,String>hm=new HashMap<Integer,String>();
            hm.put(100,"Amit");
            hm.put(101,"Vijay");
            hm.put(105,"Rahul");
            hm.put(103,"Sonam");
            hm.put(104,"Shreya");
            hm.put(102,"Rutuja");


            for(Map.Entry m:hm.entrySet())
            {
                 System.out.println(m.getKey()+"  "+m.getValue());
            }
            System.out.println("-------------------------");
             for(Map.Entry m:hm.entrySet())
            {
                 System.out.println(m.getKey());
            }
      }
}