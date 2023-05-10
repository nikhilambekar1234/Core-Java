import java.util.*;
class CollectionClassMax
{
	public static void main(String arg[])
	{
		List<Integer> list =new ArrayList<Integer>();
		list.add(46);
		list.add(67);
		list.add(24);
		list.add(16);
		list.add(8);
		list.add(12);
		
		
		System.out.println("value of maximum element from the collection: "+Collections.max(list));
		System.out.println("value of minimum element from the collection: "+Collections.min(list));
	}
}