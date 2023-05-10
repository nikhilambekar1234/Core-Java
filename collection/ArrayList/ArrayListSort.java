import java.util.*;
class ArrayListSort
{
	public static void main(String arg[])
	{
		//creating a list of fruits
		List<String> list1=new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		
		//sorting the list
		
		Collections.sort(list1);
		//traversing list through the for-each loop
		
		for(String fruit : list1)
		{
			System.out.println(fruit);
			
			System.out.println("sorting numbers");
			//creating a list of numbers
			
			List<Integer> list2=new ArrayList<Integer>();
			list2.add(21);
			list2.add(11);
			list2.add(51);
			list2.add(1);
			
			//sorting the list
			Collections.sort(list2);
			
			//traversing list through the for-each loop
			for(Integer number : list2)
			{
				System.out.println(number);
			}
			
		}
	}
}