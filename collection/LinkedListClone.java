
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

class LinkedListClone
{
	public static void main(String arg[])
	{
		//create a linkedlist of string
		LinkedList<String> list=new LinkedList<String>();
		
		//add few elements
		list.add("element1");
		list.add("element2");
		list.add("element3");
		list.add("element4");
		
		// Display LinkList elements
         System.out.println("LinkedList : "+list);
		 
		 //creating another list
        LinkedList<String> list2=new LinkedList<String>();
		
		//clone list to list2
		//public Object clone():return a shallow copy of this linkedlist
		
		list2=(LinkedList)list.clone();
		// Display second LinkList elements
         System.out.println("LinkedList second : "+list2);
          

	}
}