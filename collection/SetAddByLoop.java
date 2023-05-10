import  java.util.*;
import java.util.HashSet;
import java.util.TreeSet;
class SetAddByLoop
{
	public static void main(String arg[])
	{
		 int count[]={11,22,33,44,55};
	 Set<Integer> hset=new HashSet<Integer>();
	 try
	 {
		 for(int i=0;i<4;i++)
		 {
			 hset.add(count[i]);
		 }
		 System.out.println(hset);
		 TreeSet<Integer> treeset=new TreeSet<Integer>(hset);
		 System.out.println("The sorted list is");
		 System.out.println(treeset);
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	}
	
}