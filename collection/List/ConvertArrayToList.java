import java.util.*;
class ConvertArrayToList
{
	public static void main(String arg[])
	{
		String[] array={"Java","Python","PHP","C++"};
		System.out.println("Printing Array: "+Arrays.toString(array));
		
		//converting Array to List
		List<String> list=new ArrayList<String>();
		for(String lang : array)
		{
			list.add(lang);
		}
		System.out.println("Printing List: "+list);
			
		
	}
}