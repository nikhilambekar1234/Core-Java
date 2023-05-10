/*Points to Note about HashSet:
1.	HashSet doesn’t maintain any order, the elements would be returned in any random order.
2.	HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
3.	HashSet allows null values however if you insert more than one nulls it would still return only one null value.
4.	HashSet is non-synchronized.
5.	The iterator returned by this class is fail-fast which means iterator would throw ConcurrentModificationException if HashSet has been modified after creation of iterator, by any means except iterator’s own remove method.
*/
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Set;
class HashSet2
{
	public static void main(String arg[])
	{
		//HashSet declaration
		HashSet<String> hset=new HashSet<String>();
		
		//adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		
		//adding duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		
		//adding duplicate values
		hset.add(null);
		hset.add(null);
		
		//Displaying HashSet elements
		System.out.println(hset);
		System.out.println("------------------------------------------------------");
		
		 //public void clear(): It removes all the elements from HashSet. The set becomes empty after this method gets called.
		 //hset.clear();
		 //System.out.println(hset);
		 //	System.out.println("------------------------------------------------------");
		 
		 //Converting to array
		 String[] array=new String[hset.size()];
		 hset.toArray(array);
		 //displaying an array element
		 System.out.println("Array element");
		 for(String temp:array)
		 {
			 System.out.println(temp);
		 }
		System.out.println("------------------------------------------------------");
		//Creating a list of hashset element
		List<String> list=new ArrayList<String>(hset);
		//displaying arraylist element
		System.out.println("ArrayList contains: "+list);
		 System.out.println("------------------------------------------------------");
		 
		 //Converting to Treeset
		 // Create a HashSet
           HashSet<String> hset1 = new HashSet<String>();
 
          //add elements to HashSet
            hset1.add("Element1");
            hset1.add("Element2");
            hset1.add("Element3");
            hset1.add("Element4");

		 Set<String> tset=new TreeSet<String>(hset1);
		 //displaying TreeSet element
		 System.out.println("TreeSet element");
		 for(String temp:tset)
		 {
			 System.out.println(temp);
		 }
      

	}
}
