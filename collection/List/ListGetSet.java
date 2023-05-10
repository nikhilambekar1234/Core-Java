import java.util.*;
class ListGetSet
{
	public static void main(String arg[])
	{
		   List<String> list=new ArrayList<String>();  //creating List
	       list.add("Mango");
	       list.add("Apple");
	       list.add("Banana");
	       list.add("Grapes");
	
	        //Accessing the element
	       System.out.println("Returning element: "+list.get(1)); //it will return the 2nd element because index 1;
		   
		   //changing the element
		   list.set(1,"Date");
		   
		   //traversing list
		   for(String fruit : list)
		   {
			   System.out.println(fruit);
		   }
	}
	
	
}