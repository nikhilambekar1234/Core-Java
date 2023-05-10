import java.util.*;
class Deque1
{
	public static void main(String arg[])
	{
		
		//creating deque and adding elements
		
		Deque<String>deque=new ArrayDeque<String>();
		
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Vijay");
		
		//Traversing elements
		for(String str : deque)
		{
			System.out.println(str);
		}
	}
}