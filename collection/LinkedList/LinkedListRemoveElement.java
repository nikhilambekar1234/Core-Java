import java.util.*;
class LinkedListRemoveElement
{
	public static void main(String arg[])
	{
		LinkedList<String> al=new LinkedList<>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		al.add("Harsh");
		al.add("Virat");
		al.add("Gaurav");
		al.add("Harish");
		al.add("Amit");
		System.out.println("An initial list of elements: "+al);
		
		//removing specific elements from arraylist
		al.remove("Vijay");
		System.out.println("After invoking remove (object)method: "+al);
		
		//Removing elements on the basis of position
		al.remove(0);
		System.out.println("After invoking remove(index)method: "+al);
		
		//creating another Linkedlist
		LinkedList<String> al2=new LinkedList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		
		//Adding new elements to linkedlist
		al.addAll(al2);
		System.out.println("Updated list: "+al);
		
		//removing all the elements from linkedlist
		al.removeAll(al2);
		System.out.println("After invoking removeAll()method: "+al);
		
		//removing first elements from the list
		al.removeFirst();
		System.out.println("After invoking removeFirst() method: "+al);
		
		//removing first occurence of elements from the list
		al.removeFirstOccurrence("Gaurav");
		System.out.println("After invoking removeFirstOccurrence() method: "+al);
			
		//removing last occurence elements from the list
		al.removeLastOccurrence("Harsh");
		System.out.println("After invoking removeLastOccurrence() method: "+al);
		
	/*	//removing elements on the basis of specified condition
		al.removeIf(str->str.contains("Ajay")); //here,we are using lambda expression
		System.out.println("After invoking removeIf()method: "+al);
	*/	
		//removing all the elements available in the list
		al.clear();
		System.out.println("After invoking clear()method: "+al);
		
		
	}
}