import java.util.*;
class MapGeneric
{
	public static void main(String arg[])
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100,"Amit");
		map.put(102,"Vijay");
		map.put(101,"Rahul");
		
		//Elements can traverse in any order
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}
}