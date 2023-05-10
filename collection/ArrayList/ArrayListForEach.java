import java.util.*;
class ArrayListForEach
{
	public static void main(String arg[])
	{
		ArrayList<String> list=new ArrayList<String>();  //creating arraylist
		list.add("Mango");  //adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		//traversing list through for-each loop
		for(String fruit:list)
		{
			System.out.println(fruit);
		}
	}
}