import java.util.*;
class LinkedHashSet1
{
	public static void main(String arg[])
	{
		//creating LinkedHashSet and adding elements
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		//Travesing elements
		Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}