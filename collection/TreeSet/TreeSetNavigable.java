import java.util.*;
class TreeSetNavigable
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
         System.out.println("Reverse Set: "+set.descendingSet());    
         System.out.println("Head Set: "+set.headSet("C",true));
		 System.out.println("Sub Set: "+set.subSet("A",false,"E",true));
		 System.out.println("Tail Set: "+set.tailSet("C",false));
	}
}