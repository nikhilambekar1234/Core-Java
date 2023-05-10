import java.util.*;
class ConvertListToArray
{
	public static void main(String arg[])
	{
		List<String> fruitList = new ArrayList<>();
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		
		//converting ArrayList to Array
		String[] array=fruitList.toArray(new String[fruitList.size()]);
		System.out.println("Printing array: "+Arrays.toString(array));
		System.out.println("Printing List: "+fruitList);
		
	}
}