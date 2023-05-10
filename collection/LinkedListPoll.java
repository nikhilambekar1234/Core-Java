import java.util.LinkedList;
class LinkedListPoll
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
		list.add("element5");
		list.add("element6");
		list.add("element7");
		list.add("element8");
		
		//display linkedlist element
		System.out.println("linkedlist before: "+list);
		//poll(): retrieves and removes the head (first element) of this list
		System.out.println("element removes: "+list.poll());
		//display linkedlist element
		System.out.println("linkedlist after: "+list);
		System.out.println("------------------------------------------------------");
		
		 // pollFirst(): Retrieves and removes the first element of this list, or returns null if this list is empty.
            System.out.println("Element removed: "+list.pollFirst());
         // Display list after calling pollFirst() method
           System.out.println("LinkedList after: "+list);
		  System.out.println("------------------------------------------------------");
		  
		  //pollLast(): Retrieves and removes the first element of this list, or returns null if this list is empty.
           System.out.println("Element removed: "+list.pollLast());
		   // Display after calling pollLast() method
           System.out.println("LinkedList after: "+list);


		
	}
}