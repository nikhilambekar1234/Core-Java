import java.util.*;
class MapNonGeneric
{
	public static void main(String arg[])
	{
		   Map map=new HashMap();
	   //adding elements to map
	    map.put(1,"Amit");
	    map.put(5,"Rahul");
	    map.put(2,"Jay");
	    map.put(6,"Amit");
	
	 //Traversing Map
	   Set set=map.entrySet();  //Converting to set so that we can traverse
	   Iterator itr=set.iterator();
	   while(itr.hasNext())
	   {
		   //converting to Map.Entry so that we can get key and and value separately
		   Map.Entry entry=(Map.Entry)itr.next();
		   System.out.println(entry.getKey()+"   "+entry.getValue());
	   }
	}
	
	
}