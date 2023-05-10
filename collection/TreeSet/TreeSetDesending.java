import java.util.*;
class TreeSetDesending
{
	public static void main(String arg[])
	{
		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ajay");
		
		System.out.println("Traversing element through Iterator in decending order");
		Iterator i=set.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}