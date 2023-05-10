import java.util.*;
class ArrayListRemoveElement
{
	public static void main(String arg[])
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		System.out.println("An initial list of elements: "+al);
		
		//removing specific elements from arraylist
		al.remove("Vijay");
		System.out.println("After invoking remove (object)method: "+al);
		
		//Removing elements on the basis of position
		al.remove(0);
		System.out.println("After invoking remove(index)method: "+al);
		
		//creating another arraylist
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		
		//Adding new elements to arraylist
		al.addAll(al2);
		System.out.println("Updated list: "+al);
		
		//removing all the elements from arraylist
		al.removeAll(al2);
		System.out.println("After invoking removeAll()method: "+al);
		
		//removing elements on the basis of specified condition
		al.removeIf(str->str.contains("Ajay")); //here,we are using lambda expression
		System.out.println("After invoking removeIf()method: "+al);
		
		//removing all the elements available in the list
		al.clear();
		System.out.println("After invoking clear()method: "+al);
		
		
	}
}