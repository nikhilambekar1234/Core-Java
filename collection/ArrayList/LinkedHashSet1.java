import java.util.*;
class LinkedHashSet1
{
	public static void main(String arg[])
	{
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}