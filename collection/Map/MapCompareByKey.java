import java.util.*;
class MapCompareByKey
{
	public static void main(String arg[])
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100,"Amit");
		map.put(101,"Vijay");
		map.put(102,"Rahul");
		
		//returns a set view of the mapping contained in this map
		map.entrySet()
		
		//returns a sequential Stream  with this collection as its source
		.stream()
		
		//sorted according to the provided Comparator
		.sorted(Map.Entry.comparingByKey())
		
		//perform an action for each element of this stream
		.forEach(System.out::println);
		
	}
}