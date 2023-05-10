import java.util.*;
class TreeMap3
{
      public static void main(String arg[])
      {
            TreeMap<Integer,String>hm=new TreeMap<Integer,String>();
            hm.put(100,"Amit");
            hm.put(101,"Vijay");
            hm.put(105,"Rahul");
          


            for(Map.Entry m:hm.entrySet())
            {
                 System.out.println(m.getKey()+"  "+m.getValue());
            }
      }
}