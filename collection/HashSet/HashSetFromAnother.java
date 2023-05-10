import java.util.*;
class HashSetFromAnother
{
	public static void main(String arg[])
	{
		//creating ArrayList 
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		
		HashSet<String> set=new HashSet<String>(list);
		set.add("Gaurav");
		
		//Travesing elements
		Iterator<String> i=set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}