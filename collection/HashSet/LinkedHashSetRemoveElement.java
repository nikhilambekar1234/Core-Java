import java.util.*;
class LinkedHashSetRemoveElement
{
	public static void main(String arg[])
	{
		LinkedHashSet<String> set=new LinkedHashSet<>();
		set.add("java");
		set.add("J");
		set.add("Point");
		set.add("Good");
		set.add("Website");
	
		System.out.println("An initial list of elements: "+set);
		
		//removing an elements from the above linked set
		//since an element "Good" is present, therefore, the method remove()
		//returns true
		System.out.println(set.remove("Good"));
		
		//After removing element
		System.out.println("After removing element, the hashset is : "+set);
		
		//since the element "For" is not present ,therefore, the method remove();
		//returns false
		System.out.println(set.remove("For"));
	}
}