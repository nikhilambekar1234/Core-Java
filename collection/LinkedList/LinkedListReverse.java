import java.util.*;
class LinkedListReverse
{
	public static void main(String arg[])
	{
		LinkedList<String> al=new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		//traversing the list of elements in reverse order
		Iterator i=al.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}