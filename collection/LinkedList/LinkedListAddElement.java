import java.util.*;
class LinkedListAddElement
{
	public static void main(String arg[])
	{
		LinkedList<String> al=new LinkedList<String>();
		System.out.println("Initial list of elements: "+al);
		//Adding elements to the end of the list
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		System.out.println("After invoking add(E e) method: "+al);
		//Adding an elements at the specific position
		al.add(1,"Gaurav");
		System.out.println("After invoking add(int index,E elements)method: "+al);
		
		LinkedList<String> al2=new LinkedList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		
		//Adding second list elements to the first list
		al.addAll(al2);
		System.out.println("After invoking add(Collection<?extends E>c)method: "+al);
		
		LinkedList<String> al3=new LinkedList<String>();
		al3.add("John");
		al3.add("Rahul");
	    //adding second list elements to the first list at specific position
		al.addAll(1,al3);
		System.out.println("After invoking addAll(int index,Collectio<? extends E>c)method: "+al);
		
		//Adding an elements at the first position
		al.addFirst("Lokesh");
		System.out.println("After invoking addFirst((E e)method : "+al);
		
		//Adding an elements at the last position
		al.addLast("Harsh");
		System.out.println("After invoking addLast(E e) method: "+al);
		
	}
}