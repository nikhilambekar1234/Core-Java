 import java.util.*;
 class ArrayListRetain
 {
	 public static void main(String arg[])
	 {
		 ArrayList<String> al=new ArrayList<String>();
		 al.add("Ravi");
		 al.add("Vijay");
		 al.add("Ajay");
		 
		 ArrayList<String> al2=new ArrayList<String>();
		 al2.add("Ravi");
		 al2.add("Hanumant");
		 
		 al.retainAll(al2);
		 System.out.println("iterating the elements after retaining the elements");
		 Iterator itr=al.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }

	 }
 }