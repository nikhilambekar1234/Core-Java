import java.util.*;
class List1
{
	public static void main(String arg[])
	{
		List<String>list=new ArrayList<String>();   //creating arraylist
		list.add("Ravi");  //Adding object in arralist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
	/*	//Traversing list through Iterator
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	*/
       // Iterating the list element using for-each loop
        for(String fruit : list)
        {
			System.out.println(fruit);
		}			
	}
}