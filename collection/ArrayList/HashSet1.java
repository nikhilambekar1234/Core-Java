import java.util.*;
class HashSet1
{
	public static void main(String arg[])
	{
		//creating HashSet and adding elements
		HashSet<String> set=new HashSet<String>();
		
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