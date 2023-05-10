import java.util.*;
enum days
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
class EnumSet1
{
	public static void main(String arg[])
	{
		Set<days> set=EnumSet.of(days.TUESDAY,days.WEDNESDAY);
		
		//traversing elements
		Iterator<days> iter=set.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}