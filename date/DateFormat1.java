import java.text.DateFormat;
import java.util.Date;
public class DateFormat1
{
	public static void main(String arg[])
	{
		Date currentDate=new Date();
		System.out.println("Current Date: "+currentDate);
		String dateToStr=DateFormat.getInstance().format(currentDate);
		System.out.println("Date Format using getInstance(): "+dateToStr);
	}
}