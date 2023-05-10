//public E peek(): Retrieves, but does not remove, the head (first element) of this list.
//public E peekFirst(): Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
//public E peekLast(): Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

class LinkedListPeek
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
		list.add("element3");
		list.add("element8");
		
		
		     // Display LinkList elements
             System.out.println("LinkedList before: "+list);

            //peek()
             System.out.println(list.peek());
 
              //peekFirst()
              System.out.println(list.peekFirst());
 
             //peekLast()
              System.out.println(list.peekLast());

             // Should be same as peek methods does not remove
             System.out.println("LinkedList after: "+list);

             //searching first occurrence of element
			 int firstIndex=list.indexOf("element3");
			 System.out.println("first occurrence: "+firstIndex);
             
		    //searching last occurrence of element
			 int lastIndex=list.lastIndexOf("element3");
			 System.out.println("last occurrence: "+lastIndex);
			 System.out.println("----------------------------------------------------------");
			 
			     // Displaying LinkedList elements
                  System.out.println("LinkedList elements:");
                  Iterator it= list.iterator();
                 while(it.hasNext())
				 {
                       System.out.println(it.next());
                  }
 
                  // Obtaining SUBLIST from the LinkedList
                  List sublist = list.subList(2,5);
 
                  // Displaying SubList elements
                   System.out.println("\nSub List elements:");
                    Iterator subit= sublist.iterator();
                 while(subit.hasNext())
				 {
                        System.out.println(subit.next());
                 }

	}
}