import java.util.*;
class SortWrapper
{
	public static void main(String arg[])
	{
		ArrayList al=new ArrayList();
		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(101));
		al.add(230);  //internally will be converted into objects as Integer.valueOf
		
		Collections.sort(al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}