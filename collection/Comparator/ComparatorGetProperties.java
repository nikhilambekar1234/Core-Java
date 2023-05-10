import java.util.*;
import java.io.*;
class ComparatorGetProperties
{
	public static void main(String arg[])
	{
		Properties p=System.getProperties();
	    Set set=p.entrySet();
	
	    Iterator itr=set.iterator();
	    while(itr.hasNext())
	    {
		Map.Entry entry=(Map.Entry)itr.next();
		System.out.println(entry.getKey()+" = "+entry.getValue());
	    }
	}
	
}