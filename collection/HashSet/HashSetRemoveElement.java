import java.util.*;
class HashSetRemoveElement
{
	public static void main(String arg[])
	{
		HashSet<String> set=new HashSet<>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
	
		System.out.println("An initial list of elements: "+set);
		
		//removing specific elements from HashSet
		set.remove("Ravi");
		System.out.println("After invoking remove (object)method: "+set);
		
	 //creating another HashSet
		HashSet<String> set1=new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		
		//Adding new elements to hashset
		set.addAll(set1);
		System.out.println("Updated list: "+set);
		
		//removing all the elements from hashset
		set.removeAll(set1);
		System.out.println("After invoking removeAll()method: "+set);
		
		//removing elements on the basis of specified condition
		set.removeIf(str->str.contains("Vijay")); //here,we are using lambda expression
		System.out.println("After invoking removeIf()method: "+set);
		
		//removing all the elements available in the list
		set.clear();
		System.out.println("After invoking clear()method: "+set);
		
		
	}
}