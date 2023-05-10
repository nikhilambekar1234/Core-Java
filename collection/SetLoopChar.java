import  java.util.*;
import java.util.HashSet;
import java.util.TreeSet;
class SetLoopChar
{
	public static void main(String arg[])
	{
		 char count[]={'a','c','b'};
	 Set<Character> hset=new HashSet<Character>();
	 try
	 {
		 for(int i=0;i<3;i++)
		 {
			 hset.add(count[i]);
		 }
		 System.out.println(hset);
		 TreeSet<Character> treeset=new TreeSet<Character>(hset);
		 System.out.println("The sorted list is");
		 System.out.println(treeset);
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	}
	
}