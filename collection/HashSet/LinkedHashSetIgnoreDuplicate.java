import java.util.*;
class LinkedHashSetIgnoreDuplicate
{
	public static void main(String arg[])
	{
		//creating LinkedHashSet and adding elements
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		//Travesing elements
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}