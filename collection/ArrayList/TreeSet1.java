import java.util.*;
class TreeSet1
{
	public static void main(String arg[])
	{
		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		//traversing elements
		
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}