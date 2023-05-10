import java.util.*;
class HashSet1
{
	public static void main(String arg[])
	{
		//creating HashSet and adding elements
		HashSet<String> set=new HashSet<String>();
		
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