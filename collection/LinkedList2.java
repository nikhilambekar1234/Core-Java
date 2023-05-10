 import java.util.*;
 class LinkedList2
 {
	 public static void main(String arg[])
	 {
		 LinkedList<String> list=new LinkedList<String>();
		 
		 //Adding elements to the linked list
		 list.add("Steve");
		 list.add("Carl");
		 list.add("Raj");
		 
		 //Adding an elements to the first position
		 list.addFirst("Negan");
		 
		 //Adding an elements to the last position
		 list.addLast("Rick");
		 
		  //Adding an elements to the 3rd position
		 list.add(2,"Glenn");
		 
		      //Iterating LinkedList
            Iterator<String> iterator=list.iterator();
             while(iterator.hasNext())
			 {
                 System.out.println(iterator.next());
             }

	 }
 }