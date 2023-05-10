import java.util.*;
class ArrayListIterator
{
	public static void main(String arg[])
	{
		ArrayList<String> list =new ArrayList<String>();  //creating arraylist
		
		list.add("Mango");  //adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		//Traversing list through iterator
		
		Iterator itr=list.iterator();  //getting the Iterator
		
		while(itr.hasNext())
		{
			//check if iterator has the elements
			System.out.println(itr.next()); //printing the elements and move to next
		}
	}
}