import java.util.*;
class ArrayListInitialization
{
	public static void main(String arg[])
	{
		//Method 1: Initialization using Arrays.asList
		ArrayList<String> obj=new ArrayList<String>
		(
		    Arrays.asList("Pratap","Peter","Harsh")
		);
		System.out.println("Elements are: "+obj);
		
		//Method 2: Anonymous inner class method to initialize ArrayList
		ArrayList<String> cities=new ArrayList<String>()
		{
			{
				add("Delhi");
				add("Agra");
				add("Chennai");
			}
		};
		System.out.println("Elements are: "+cities);
		
		//Method3: Normal way of ArrayList initialization
		   ArrayList<String> books = new ArrayList<String>();
	       books.add("Java Book1");
	       books.add("Java Book2");
	       books.add("Java Book3");
	       System.out.println("Books stored in array list are: "+books);
		   
		   	//Collection of copies
			  ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10,5));
			  System.out.println("ArrayList items: "+intlist);

		
	}
}