/*LinkedHashSet Class in Java with Example
1.	HashSet doesn’t maintain any kind of order of its elements.
2.	TreeSet sorts the elements in ascending order.
3.	LinkedHashSet maintains the insertion order. Elements gets sorted in the same sequence in which they have been added to the Set.
1) HashSet gives better performance (faster) than TreeSet for the operations like add, remove, contains, size etc. HashSet offers constant time cost while TreeSet offers log(n) time cost for such operations.
2) HashSet does not maintain any order of elements while TreeSet elements are sorted in ascending order by default.

*/

import java.util.LinkedHashSet;
import java.util.TreeSet;
class LinkedHashSet2
{
	public static void main(String arg[])
	{
		//HashSet declaration
		LinkedHashSet<String> lhset=new LinkedHashSet<String>();
		
		//adding elements to the HashSet
		lhset.add("Apple");
		lhset.add("Mango");
		lhset.add("Grapes");
		lhset.add("Orange");
		lhset.add("Fig");
		System.out.println(lhset);
		System.out.println("------------------------------------------------------");
		
		TreeSet<String> tset2 = new TreeSet<String>();
		
		//adding elements to the HashSet
		 tset2.add("Apple");
		 tset2.add("Mango");
		 tset2.add("Grapes");
		 tset2.add("Orange");
		 tset2.add("Fig");
		
		
		System.out.println( tset2);
		 

	}
}
