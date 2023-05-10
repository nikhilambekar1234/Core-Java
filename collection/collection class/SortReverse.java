import java.util.*;
class SortReverse
{
	public static void main(String arg[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Viru");
		al.add("Saurav");
		al.add("Mukesh");
		al.add("Tahir");
		
		Collections.sort(al,Collections.reverseOrder());
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}