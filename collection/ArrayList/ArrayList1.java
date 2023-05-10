import java.util.*;
class ArrayList1
{
	public static void main(String arg[])
	{
		ArrayList<String>list=new ArrayList<String>();   //creating arraylist
		list.add("Ravi");  //Adding object in arralist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		//Traversing list through Iterator
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}