import java.util.*;
class ArrayListAdd
{
	public static void main(String arg[])
	{
		ArrayList<String>alist=new ArrayList<String>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");
		//display elements
		System.out.println(alist);
		
		//Assending sort elements
		System.out.println("Assending sort");
		Collections.sort(alist);
		for(String str : alist)
		{
			System.out.println(str);
		}
		
		//Descending order sort elements
		System.out.println("Descending sort");
		Collections.sort(alist,Collections.reverseOrder());
		for(String str : alist)
		{
			System.out.println(str);
		}
		
		//size of arraylist
		System.out.println("Number of elements in ArrayList: "+alist.size());
		
		//Adding "Steve" at the fourth position
		alist.add(3,"Steve");
		//display elements
		System.out.println(alist);
		
		//remove
		alist.remove("Steve");
		alist.remove("Angela");
		//display elements
		System.out.println(alist);
		
		//remove 3rd elements
		alist.remove(2);
		//display elements
		System.out.println(alist);
		
		ArrayList<String>alist1=new ArrayList<String>();
		alist1.add("Steve");
		alist1.add(0,"Tim");
		alist1.add("Lucy");
	   //display elements
		System.out.println(alist1);
		
		//SUBLIST to arraylist
		System.out.println("original list : "+alist);
		ArrayList<String>alist2=new ArrayList<String>(alist.subList(1,3));
		System.out.println("sublist in arraylist : "+alist2);
		
		//SUBLIST to List
		List<String>alist3=alist.subList(1,3);
		System.out.println("sublist in list : "+alist3);
		
	}
}