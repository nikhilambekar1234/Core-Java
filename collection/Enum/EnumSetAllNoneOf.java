import java.util.*;
enum days
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
class EnumSetAllNoneOf
{
	public static void main(String arg[])
	{
		Set<days> set1=EnumSet.allOf(days.class);
		System.out.println("Week Days: "+set1);
		
		Set<days> set2=EnumSet.noneOf(days.class);
		System.out.println("Week Days: "+set2);
		
	}
}