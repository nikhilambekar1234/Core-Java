import java.util.*;
class ListIterator2
{
    public static void main(String arg[])
    {
           ArrayList<String> al=new ArrayList<String>();
            al.add("Amit");
            al.add("Vijay");
            al.add("Kumar");
            al.add(1,"Sachin");

           System.out.println("element at 2nd position: "+al.get(2));

          //  ListIterator<String> itr=al.listIterator();

            System.out.println("traversing element in forward direction");
             for(String obj : al)
               {
                    
                    System.out.println(obj);
               }

          System.out.println("traversing element in backward direction");
            for(int i=3;i>=0;i--)
            {
                System.out.println(al.get(i));
            }

    }
}