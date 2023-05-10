import java.util.*;
class TreeSetSortedSet
{
	public static void main(String arg[])
	{
		 TreeSet<String> set=new TreeSet<String>();    
         set.add("A");    
         set.add("B");    
         set.add("C");    
         set.add("D");    
		 set.add("E"); 
		 System.out.println("Initial Set: "+set);     
         System.out.println("Head Set: "+set.headSet("C"));
		 System.out.println("Sub Set: "+set.subSet("A","E"));
		 System.out.println("Tail Set: "+set.tailSet("C"));
	}
}