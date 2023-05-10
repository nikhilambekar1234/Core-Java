import java.util.*;
class LinkedHashMap
{
	public static void main(String arg[])
	{
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
	    hm.put(100,"Amit");
	    hm.put(102,"Vijay");
		hm.put(101,"Rahul");
		
		//Elements can traverse in any order
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}
}import java.util.*;  
class LinkedHashMap2{  
 public static void main(String args[]){  
   LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();           
      map.put(100,"Amit");    
     map.put(101,"Vijay");    
     map.put(102,"Rahul");    
       //Fetching key  
       System.out.println("Keys: "+map.keySet());  
       //Fetching value  
       System.out.println("Values: "+map.values());  
       //Fetching key-value pair  
       System.out.println("Key-Value pairs: "+map.entrySet());  
 }  
}  