 import java.util.*;
 class LinkedListRemove
 {
	 public static void main(String arg[])
	 {
		 LinkedList<String> list=new LinkedList<String>();
		 
		 //Adding elements to the linked list
		 list.add("Steve");
		 list.add("Carl");
		 list.add("Raj");
		  list.add("Negan");
		 list.add("Rick");
		 
		  System.out.println("linkedList content: "+list);
		  //Get and Set VALUE
		  Object var1=list.get(0);
		  System.out.println("first element: "+var1);
		  System.out.println("first element: "+list.getFirst());
		  System.out.println("last element: "+list.getLast());
		  list.set(1,"Nik");
		  System.out.println("changed element: "+list);
		  
		 //remove an elements to the first position
		 //same as list.remove(0);
		 list.removeFirst();
		 
		 //remove an elements to the last position
		 list.removeLast();
		 
		  //Iterating LinkedList
		  System.out.println("step 1  remove first and last");
            Iterator<String> iterator=list.iterator();
             while(iterator.hasNext())
			 {
                 System.out.println(iterator.next()+" ");
             }
			 
		  //remove an elements to the 3rd position
		  System.out.println("step 2  remove index based");
		 list.remove(2);
		 
		      //Iterating LinkedList
            Iterator<String> iterator2=list.iterator();
             while(iterator2.hasNext())
			 {
                 System.out.println(iterator2.next());
             }

	 }
 }